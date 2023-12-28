package com.example.servicevoiture.Model;

import com.example.servicevoiture.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "voiture")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marque;
    private String matricule;
    private String model;
    private Long id_client;

    @Transient
    @ManyToOne
    @JoinColumn(name = "id_client", insertable = false, updatable = false)
    private Client client;




    
    


}
