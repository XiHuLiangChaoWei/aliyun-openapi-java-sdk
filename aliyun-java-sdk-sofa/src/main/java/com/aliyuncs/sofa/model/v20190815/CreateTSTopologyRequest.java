/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTSTopologyRequest extends RpcAcsRequest<CreateTSTopologyResponse> {
	   

	private String triggerType;

	private Long baseVersion;

	private String des;

	private Long id;

	private String cron;

	private String topology;

	private String instanceId;

	private Long processId;

	private String name;

	private String customParams;
	public CreateTSTopologyRequest() {
		super("SOFA", "2019-08-15", "CreateTSTopology", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
		if(triggerType != null){
			putBodyParameter("TriggerType", triggerType);
		}
	}

	public Long getBaseVersion() {
		return this.baseVersion;
	}

	public void setBaseVersion(Long baseVersion) {
		this.baseVersion = baseVersion;
		if(baseVersion != null){
			putBodyParameter("BaseVersion", baseVersion.toString());
		}
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
		if(des != null){
			putBodyParameter("Des", des);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getCron() {
		return this.cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
		if(cron != null){
			putBodyParameter("Cron", cron);
		}
	}

	public String getTopology() {
		return this.topology;
	}

	public void setTopology(String topology) {
		this.topology = topology;
		if(topology != null){
			putBodyParameter("Topology", topology);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
		if(processId != null){
			putBodyParameter("ProcessId", processId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getCustomParams() {
		return this.customParams;
	}

	public void setCustomParams(String customParams) {
		this.customParams = customParams;
		if(customParams != null){
			putBodyParameter("CustomParams", customParams);
		}
	}

	@Override
	public Class<CreateTSTopologyResponse> getResponseClass() {
		return CreateTSTopologyResponse.class;
	}

}
