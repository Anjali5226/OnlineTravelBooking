-- Create Database
CREATE DATABASE IF NOT EXISTS travel_booking;
USE travel_booking;

-- User Table
CREATE TABLE IF NOT EXISTS users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    role ENUM('Admin', 'TravelAgent', 'Traveler') NOT NULL
);

-- Flights Table
CREATE TABLE IF NOT EXISTS flights (
    flight_id INT AUTO_INCREMENT PRIMARY KEY,
    flight_name VARCHAR(100) NOT NULL,
    origin VARCHAR(100) NOT NULL,
    destination VARCHAR(100) NOT NULL,
    departure_date DATE NOT NULL,
    price DOUBLE NOT NULL,
    seats_available INT NOT NULL
);

-- Hotels Table
CREATE TABLE IF NOT EXISTS hotels (
    hotel_id INT AUTO_INCREMENT PRIMARY KEY,
    hotel_name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    available_rooms INT NOT NULL,
    price_per_night DOUBLE NOT NULL
);

-- Car Rentals Table
CREATE TABLE IF NOT EXISTS car_rentals (
    car_id INT AUTO_INCREMENT PRIMARY KEY,
    car_model VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL,
    availability BOOLEAN DEFAULT TRUE,
    price_per_day DOUBLE NOT NULL
);

-- Bookings Table
CREATE TABLE IF NOT EXISTS bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    booking_type ENUM('Flight', 'Hotel', 'Car') NOT NULL,
    item_id INT NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status ENUM('Pending', 'Confirmed', 'Cancelled') DEFAULT 'Pending',
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- Sample Data
INSERT INTO users (name, email, password, role) VALUES
('Admin User', 'admin@example.com', 'admin123', 'Admin'),
('Agent User', 'agent@example.com', 'agent123', 'TravelAgent'),
('Traveler User', 'traveler@example.com', 'travel123', 'Traveler');

INSERT INTO flights (flight_name, origin, destination, departure_date, price, seats_available) VALUES
('Air India 101', 'Delhi', 'Mumbai', '2025-11-05', 4500, 50),
('IndiGo 205', 'Bangalore', 'Kolkata', '2025-11-07', 4000, 40);

INSERT INTO hotels (hotel_name, location, available_rooms, price_per_night) VALUES
('Taj Palace', 'Delhi', 10, 8000),
('The Oberoi', 'Mumbai', 8, 7500);

INSERT INTO car_rentals (car_model, location, availability, price_per_day) VALUES
('Swift Dzire', 'Delhi', TRUE, 1200),
('Innova Crysta', 'Mumbai', TRUE, 2500);
