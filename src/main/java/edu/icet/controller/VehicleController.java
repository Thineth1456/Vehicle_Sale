package edu.icet.controller;

import edu.icet.dto.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class VehicleController {
    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    @GetMapping("/getAllVehicles")
    public List<Vehicle> getVehicleName(){
        vehicleList.add(new Vehicle("V001","Toyota","aqua",6800000.0));
        vehicleList.add(new Vehicle("V002","Nissan","Caravan",4800000.0));
        return vehicleList;
    }
    @PostMapping("/addVehicle")
    public List<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
        vehicleList.add(vehicle);
        return vehicleList;
    }
    @GetMapping("/Brands")
    public List<String> getVehicleBrands(){
        List<String> brands = new ArrayList<>();

        vehicleList.forEach(vehicle -> {
            brands.add(vehicle.getBrandName());
        });
      return brands;
    }

    @GetMapping("/models")
    public List<String> getVehicleModels(){
        List<String> brands = new ArrayList<>();

        vehicleList.forEach(vehicle -> {
            brands.add(vehicle.getModel());
        });
        return brands;
    }

    @DeleteMapping("/deleteVehicle")
    public void delete(@RequestBody String id){
        for (int i=0;i<vehicleList.size();i++){
            if (vehicleList.get(i).getVehicleModelId()==id){
                vehicleList.remove(i);
            }
        }
    }
    @PostMapping("/updateVehiclePrice")
    public void updateVehicle(String id,double price){
        for (int i=0;i<vehicleList.size();i++){
            if (vehicleList.get(i).getVehicleModelId()==id){
                vehicleList.get(i).setPrice(price);
            }
        }
    }
}
