package jclevel5.creatingobjects;

class Pet
{
    int x = 5, y = 5;
    int weight = 10;

    Pet(int x, int y)
    {
        this.x = x;
            this.y = y;
    }
}
class Cat extends Pet
{
    int tailLength = 8;
    int age;
    Cat(int x, int y, int age)
    {
        super(x, y);
            this.age = age;
    }
}


