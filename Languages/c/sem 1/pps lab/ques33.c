#include <stdio.h>
#include <string.h>
typedef struct Time {
    int hour;
    int minute;
} Time;
typedef struct TRAIN_INFO {
    int t_no;
    char t_name[30];
    Time departure_time;
    Time arrival_time;
    char start_station[30];
    char end_station[30];
} TRAIN_INFO;
void main() {
    TRAIN_INFO ts[100];
    int c = 0;
    ts[c++] = (TRAIN_INFO){1, "Express", {8, 0}, {10, 30}, "Delhi", "Meerut"};
    ts[c++] = (TRAIN_INFO){2, "Local", {9, 30}, {12, 15}, "Meerut", "kannauj"};
    ts[c++] = (TRAIN_INFO){3, "Express", {10, 0}, {12, 45}, "Delhi", "Kanpur"};
    ts[c++] = (TRAIN_INFO){4, "Local", {12, 0}, {14, 45}, "Meerut", "kannauj"};
    printf("Train No. | Train Name | Departure Time | Arrival Time | Start Station | End Station\n");
    printf("------------------------------------------------------------------------------\n");
    printf("Trains from Delhi:\n");
    list_ts_from_section(ts, c, "Delhi");
    printf("Trains from Meerut at 9:30:\n");
    list_ts_from_station_at_time(ts, c, "Meerut", (Time){9, 30});
    printf("Trains from Meerut within one hour of 12:00:\n");
    list_ts_from_station_within_one_hour(ts, c, "Meerut", (Time){12, 0}); 
    printf("Trains from Meerut to kannauj:\n");
    list_ts_between_stations(ts, c, "Meerut", "kannauj");
}
void list_ts_from_section(TRAIN_INFO ts[], int c, char section[]) {
    for (int i = 0; i < c; i++) {
        if (strcmp(ts[i].start_station, section) == 0) {
            printf("%d\t|%s\t|%d:%d\t|%d:%d\t|%s\t|%s\n", 
                ts[i].t_no, ts[i].t_name, 
                ts[i].departure_time.hour, ts[i].departure_time.minute,
                ts[i].arrival_time.hour, ts[i].arrival_time.minute,
                ts[i].start_station, ts[i].end_station);
        }
    }
}
void list_ts_from_station_at_time(TRAIN_INFO ts[], int c, char station[], Time time) {
    for (int i = 0; i < c; i++) {
        if (strcmp(ts[i].start_station, station) == 0 && 
            ts[i].departure_time.hour == time.hour && 
            ts[i].departure_time.minute == time.minute) {
            printf("%d\t|%s\t|%d:%d\t|%d:%d\t|%s\t|%s\n", 
                ts[i].t_no, ts[i].t_name, 
                ts[i].departure_time.hour, ts[i].departure_time.minute,
                ts[i].arrival_time.hour, ts[i].arrival_time.minute,
                ts[i].start_station, ts[i].end_station);
        }
    }
}
void list_ts_from_station_within_one_hour(TRAIN_INFO ts[], int c, char station[], Time time) {
    for (int i = 0; i < c; i++) {
        if (strcmp(ts[i].start_station, station) == 0 && 
            ts[i].departure_time.hour >= time.hour && 
            ts[i].departure_time.hour <= time.hour + 1 &&
            (ts[i].departure_time.hour != time.hour || ts[i].departure_time.minute >= time.minute)) {
            printf("%d\t|%s\t|%d:%d\t|%d:%d\t|%s\t|%s\n", 
                ts[i].t_no, ts[i].t_name, 
                ts[i].departure_time.hour, ts[i].departure_time.minute,
                ts[i].arrival_time.hour, ts[i].arrival_time.minute,
                ts[i].start_station, ts[i].end_station);
        }
    }
}
void list_ts_between_stations(TRAIN_INFO ts[], int c, char start_station[], char end_station[]) {
    for (int i = 0; i < c; i++) {
        if (strcmp(ts[i].start_station, start_station) == 0 && strcmp(ts[i].end_station, end_station) == 0) {
            printf("%d\t|%s\t|%d:%d\t|%d:%d\t|%s\t|%s\n", 
                ts[i].t_no, ts[i].t_name, 
                ts[i].departure_time.hour, ts[i].departure_time.minute,
                ts[i].arrival_time.hour, ts[i].arrival_time.minute,
                ts[i].start_station, ts[i].end_station);
        }
    }
}