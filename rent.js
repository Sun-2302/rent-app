class RentableItem {
    #name;
    #availability;

    constructor(name) {
        this.#name = name;
        this.#availability = true;
    }

    rent() {
        if (!this.#availability) {
            return `!! ${this.#name} is not available !!`;
        }
        this.availability = false;
        return `${this.#name} has been rented successfully.`;
    }

    returnItem() {
        this.#availability = true;
        return `${this.#name} has been returned and is now available.`
    }
}


//Test avec voiture
const car = new RentableItem("Car");

console.log(car.rent());
console.log(car.rent());

console.log(car.returnItem());
console.log(car.rent());

