package com.rest_api_crud.crud.service;

import com.rest_api_crud.crud.model.CloudVendor;
import java.util.List;
public interface CloudVendorService {
    
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);

    public List<CloudVendor> getAllCloudVendors();


}
