<?php

class RentableItem
{
    private string $name;
    private bool $availability;

    public function __construct(string $name)
    {
        $this->name = $name;
        $this->availability = true;
    }

    public function rent(): string
    {
        if (!$this->availability) {
            return "!! {$this->name} is not available !!";
        }

        $this->availability = false;
        return "{$this->name} has been rented successfully.";
    }

    public function returnItem(): string
    {
        $this->availability = true;
        return "{$this->name} has been returned and is now available.";
    }
}

// Test
$car = new RentableItem("Car");

echo $car->rent() . PHP_EOL;
echo $car->rent() . PHP_EOL;

echo $car->returnItem() . PHP_EOL;
echo $car->rent() . PHP_EOL;
