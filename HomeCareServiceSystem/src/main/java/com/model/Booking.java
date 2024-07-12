package com.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;

	@ManyToOne
	@JoinColumn(name = "customerId", nullable = false)
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "serviceId", nullable = false)
	private Service service;

	private Date bookingDate;
	private Date serviceDate;
	private String status;
	private String paymentStatus;

	@ManyToMany
	@JoinTable(name = "booking_cleaner", joinColumns = @JoinColumn(name = "bookingId"), inverseJoinColumns = @JoinColumn(name = "cleanerId"))
	private List<Cleaner> cleaners;

	@OneToOne(mappedBy = "booking")
	private Payment payment;

	public Booking() {
		super();
	}

	public Booking(Long bookingId, Customer customer, Service service, Date bookingDate, Date serviceDate,
			String status, String paymentStatus, List<Cleaner> cleaners, Payment payment) {
		super();
		this.bookingId = bookingId;
		this.customer = customer;
		this.service = service;
		this.bookingDate = bookingDate;
		this.serviceDate = serviceDate;
		this.status = status;
		this.paymentStatus = paymentStatus;
		this.cleaners = cleaners;
		this.payment = payment;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public List<Cleaner> getCleaners() {
		return cleaners;
	}

	public void setCleaners(List<Cleaner> cleaners) {
		this.cleaners = cleaners;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
