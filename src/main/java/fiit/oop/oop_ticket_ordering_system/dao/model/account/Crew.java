package fiit.oop.oop_ticket_ordering_system.dao.model.account;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Admin class represents admin account in database.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "crew")
@DiscriminatorValue("crew")
public class Crew extends Person {
}
