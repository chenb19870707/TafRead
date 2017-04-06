/**
 * Tencent is pleased to support the open source community by making Tars available.
 *
 * Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.support.stat.prx;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class StatSampleMsg {

	@TarsStructProperty(order = 0, isRequire = true)
	public String unid = "";
	@TarsStructProperty(order = 1, isRequire = true)
	public String masterName = "";
	@TarsStructProperty(order = 2, isRequire = true)
	public String slaveName = "";
	@TarsStructProperty(order = 3, isRequire = true)
	public String interfaceName = "";
	@TarsStructProperty(order = 4, isRequire = true)
	public String masterIp = "";
	@TarsStructProperty(order = 5, isRequire = true)
	public String slaveIp = "";
	@TarsStructProperty(order = 6, isRequire = true)
	public int depth = 0;
	@TarsStructProperty(order = 7, isRequire = true)
	public int width = 0;
	@TarsStructProperty(order = 8, isRequire = true)
	public int parentWidth = 0;

	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public String getSlaveName() {
		return slaveName;
	}

	public void setSlaveName(String slaveName) {
		this.slaveName = slaveName;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getMasterIp() {
		return masterIp;
	}

	public void setMasterIp(String masterIp) {
		this.masterIp = masterIp;
	}

	public String getSlaveIp() {
		return slaveIp;
	}

	public void setSlaveIp(String slaveIp) {
		this.slaveIp = slaveIp;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getParentWidth() {
		return parentWidth;
	}

	public void setParentWidth(int parentWidth) {
		this.parentWidth = parentWidth;
	}

	public StatSampleMsg() {
	}

	public StatSampleMsg(String unid, String masterName, String slaveName, String interfaceName, String masterIp, String slaveIp, int depth, int width, int parentWidth) {
		this.unid = unid;
		this.masterName = masterName;
		this.slaveName = slaveName;
		this.interfaceName = interfaceName;
		this.masterIp = masterIp;
		this.slaveIp = slaveIp;
		this.depth = depth;
		this.width = width;
		this.parentWidth = parentWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(unid);
		result = prime * result + TarsUtil.hashCode(masterName);
		result = prime * result + TarsUtil.hashCode(slaveName);
		result = prime * result + TarsUtil.hashCode(interfaceName);
		result = prime * result + TarsUtil.hashCode(masterIp);
		result = prime * result + TarsUtil.hashCode(slaveIp);
		result = prime * result + TarsUtil.hashCode(depth);
		result = prime * result + TarsUtil.hashCode(width);
		result = prime * result + TarsUtil.hashCode(parentWidth);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof StatSampleMsg)) {
			return false;
		}
		StatSampleMsg other = (StatSampleMsg) obj;
		return (
			TarsUtil.equals(unid, other.unid) &&
			TarsUtil.equals(masterName, other.masterName) &&
			TarsUtil.equals(slaveName, other.slaveName) &&
			TarsUtil.equals(interfaceName, other.interfaceName) &&
			TarsUtil.equals(masterIp, other.masterIp) &&
			TarsUtil.equals(slaveIp, other.slaveIp) &&
			TarsUtil.equals(depth, other.depth) &&
			TarsUtil.equals(width, other.width) &&
			TarsUtil.equals(parentWidth, other.parentWidth) 
		);
	}

	public void writeTo(TarsOutputStream _os) {
		if (null != unid) {
			_os.write(unid, 0);
		}
		if (null != masterName) {
			_os.write(masterName, 1);
		}
		if (null != slaveName) {
			_os.write(slaveName, 2);
		}
		if (null != interfaceName) {
			_os.write(interfaceName, 3);
		}
		if (null != masterIp) {
			_os.write(masterIp, 4);
		}
		if (null != slaveIp) {
			_os.write(slaveIp, 5);
		}
		_os.write(depth, 6);
		_os.write(width, 7);
		_os.write(parentWidth, 8);
	}

	public void readFrom(TarsInputStream _is) {
		this.unid = _is.read(unid, 0, true);
		this.masterName = _is.read(masterName, 1, true);
		this.slaveName = _is.read(slaveName, 2, true);
		this.interfaceName = _is.read(interfaceName, 3, true);
		this.masterIp = _is.read(masterIp, 4, true);
		this.slaveIp = _is.read(slaveIp, 5, true);
		this.depth = _is.read(depth, 6, true);
		this.width = _is.read(width, 7, true);
		this.parentWidth = _is.read(parentWidth, 8, true);
	}

}
