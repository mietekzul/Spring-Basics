package pl.raziel.spring.implementations;

import pl.raziel.spring.api.Logger;
import pl.raziel.spring.api.UserRepository;
import pl.raziel.spring.domain.User;

public class UserRepositoryImpl implements UserRepository {

	private Logger logger;

	public UserRepositoryImpl() {
	}

	public UserRepositoryImpl(Logger logger, String localization, String name) {
		this.logger = logger;
		logger.log("Lokalizacja repo: " + localization + "_" + name);
	}

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika: " + name);
		return new User(name);
	}
}
