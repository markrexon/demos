from django.shortcuts import render
from .models import blogModel
# Create your views here.
def show(request):
    data=blogModel.objects.all()
    return render(request,'home.html',{"data":data})