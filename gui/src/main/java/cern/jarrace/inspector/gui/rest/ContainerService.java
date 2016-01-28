/*
 * © Copyright 2016 CERN. This software is distributed under the terms of the Apache License Version 2.0, copied
 * verbatim in the file “COPYING”. In applying this licence, CERN does not waive the privileges and immunities granted
 * to it by virtue of its status as an Intergovernmental Organization or submit itself to any jurisdiction.
 */

package cern.jarrace.inspector.gui.rest;

import cern.jarrace.commons.domain.AgentContainer;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ContainerService {
    @GET("container/list")
    Call<List<AgentContainer>> getContainers();
}