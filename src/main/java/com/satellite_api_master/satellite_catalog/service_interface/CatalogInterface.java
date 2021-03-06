package com.satellite_api_master.satellite_catalog.service_interface;

import com.satellite_api_master.satellite_catalog.model.Catalog;
import java.util.List;
import java.util.Optional;

public interface CatalogInterface {

    // To save new catalog
    public Catalog saveCatalog(Catalog catalog);

    // To update catalog
    public Catalog updateCatalog(Catalog catalog);

    // To fetch all catalog from database
    public List<Catalog> findAllCatalog();

    // To get catalog by id
    public Optional<Catalog> getCatalogData(long id);

    // To delete catalog
    public void deleteCatalog(long id);
}