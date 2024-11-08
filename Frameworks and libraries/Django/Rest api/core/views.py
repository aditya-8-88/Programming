from django.http import JsonResponse
from .models import Drink
from .serializers import DrinkSerializer

def getDrinks(request):
    # getting all the objects of drink.
    # serialize them all
    # return them as json response
    
    drinks = Drink.objects.all()
    serializer = DrinkSerializer(drinks, many=True)
    return JsonResponse({"drinks":serializer.data})