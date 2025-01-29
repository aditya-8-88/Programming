import time
import requests
import json

SPREADSHEET_ID = "1cpfmmUAkwAepg8vrbjmuaK3toytwHQZ7deqM5GAHP3E"
API_KEY = "AIzaSyC-vukJhP571dolOSO6XCZ8wI5iu8LcwDA"

def get_current_time():
    now = time.time()
    hour = int(now // 3600)
    minute = int((now % 3600) // 60)
    second = int(now % 60)
    return hour, minute, second

def add_magnitude_to_spreadsheet(hour, minute, second):
    row_number = 1
    cell_number = 1

    magnitude = hour + minute + second

    data = {
        "values": [[magnitude]]
    }

    url = f"https://sheets.googleapis.com/v4/spreadsheets/{SPREADSHEET_ID}/values/{row_number}:{cell_number}"
    headers = {
        "Authorization": f"Bearer {API_KEY}",
        "Content-Type": "application/json"
    }

    response = requests.put(url, headers=headers, json=data)

    if response.status_code != 200:
        print("Error adding magnitude to spreadsheet:", response.text)

def save_spreadsheet_to_drive():
    # Implement Google Drive API logic here
    pass

if __name__ == "__main__":
    hour, minute, second = get_current_time()
    add_magnitude_to_spreadsheet(hour, minute, second)
    save_spreadsheet_to_drive()