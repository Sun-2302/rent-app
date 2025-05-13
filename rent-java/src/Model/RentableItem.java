package Model;

public class RentableItem {
    private String name;
    private boolean availability;

    public RentableItem(String name) {
        this.name = name;
        this.availability = true;
    }

    public String rent() {
        if (!availability) {
            return "!! " + name + " is not available !!";
        }

        availability = false;
        return name + " has been rented successfully.";
    }

    public String returnItem() {
        availability = true;
        return name + " has been returned and is now available.";
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
