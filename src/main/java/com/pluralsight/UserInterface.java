package com.pluralsight;

import com.pluralsight.utils.Console;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
        // Constructor
    }

    private void initializeDealership() { // This is the init() method mentioned in workbook 4. i just gave it a better name.
        dealership = new DealershipFileManager().getDealership();
    }

    public void display() {
        initializeDealership(); // Loads the dealership from the file.
        String options = """
                Please select from the following choices:
                1 - Find vehicles within a price range
                2 - Find vehicles by make / model
                3 - Find vehicles by year range
                4 - Find vehicles by color
                5 - Find vehicles by mileage range
                6 - Find vehicles by type (car, truck, SUV, van)
                7 - List ALL vehicles
                8 - Add a vehicle
                9 - Remove a vehicle
                99 - Quit

                >>>\s
                """;
        String selection;

        // User Interface Loop
        do {
            System.out.println("Welcome to " + dealership.getName() + "!");
            selection = Console.PromptForString(options); // Getting string instead of int because we can check if its empty
        } while (selection.isEmpty());

        switch (Integer.parseInt(selection)) {
            case 1 -> processGetByPriceRequest();
            case 2 -> processGetByMakeModelRequest();
            case 3 -> processGetByYearRequest();
            case 4 -> processGetByColorRequest();
            case 5 -> processGetByMileageRequest();
            case 6 -> processGetByVehicleTypeRequest();
            case 7 -> processGetAllVehiclesRequest();
            case 8 -> processAddVehicleRequest();
            case 9 -> processRemoveVehicleRequest();
            case 99 -> System.exit(0);
            default -> System.out.println("Invalid selection. Please try again.");
        };
    }

    public void processGetByPriceRequest() {
        // Method implementation
    }

    public void processGetByMakeModelRequest() {
        // Method implementation
    }

    public void processGetByYearRequest() {
        // Method implementation
    }

    public void processGetByColorRequest() {
        // Method implementation
    }

    public void processGetByMileageRequest() {
        // Method implementation
    }

    public void processGetByVehicleTypeRequest() {
        // Method implementation
    }

    public void processGetAllVehiclesRequest() {
        // Method implementation
    }

    public void processAddVehicleRequest() {
        // Method implementation
    }

    public void processRemoveVehicleRequest() {
        // Method implementation
    }
}
