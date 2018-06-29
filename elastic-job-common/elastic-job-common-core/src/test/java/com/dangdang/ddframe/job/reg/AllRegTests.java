/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.reg;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.dangdang.ddframe.job.reg.exception.RegExceptionHandlerTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfigurationTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperElectionServiceTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenterForAuthTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenterInitFailureTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenterMiscellaneousTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenterModifyTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenterQueryWithCacheTest;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenterQueryWithoutCacheTest;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@RunWith(Suite.class)
@SuiteClasses({
        ZookeeperConfigurationTest.class, 
        ZookeeperRegistryCenterForAuthTest.class, 
        ZookeeperRegistryCenterQueryWithCacheTest.class, 
        ZookeeperRegistryCenterQueryWithoutCacheTest.class, 
        ZookeeperRegistryCenterModifyTest.class, 
        ZookeeperRegistryCenterMiscellaneousTest.class,
        ZookeeperElectionServiceTest.class,
        RegExceptionHandlerTest.class, 
        ZookeeperRegistryCenterInitFailureTest.class
    })
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AllRegTests {
}