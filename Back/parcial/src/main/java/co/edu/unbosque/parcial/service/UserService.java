package co.edu.unbosque.parcial.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.parcial.dto.UserDTO;
import co.edu.unbosque.parcial.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService implements CRUDOperation<UserDTO> {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public UserService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int create(UserDTO data) {
		return 0;
		
	}

	@Override
	public List<UserDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		return userRepository.count();
	}

	@Override
	public boolean exist(Long id) {
		return userRepository.existsById(id);
	}

	

}
