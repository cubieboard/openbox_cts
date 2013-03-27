/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.net.wifi.cts;


import android.net.wifi.cts.WifiInfoTest;
import android.net.wifi.cts.WifiConfigurationTest;
import android.net.wifi.cts.WifiManagerTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class WifiSuiteTest extends TestSuite {
    public static Test suite() {
        TestSuite result = new TestSuite();
        result.addTestSuite(WifiInfoTest.class);
        result.addTestSuite(WifiConfigurationTest.class);
        result.addTestSuite(WifiManagerTest.class);
       
        return result;
    }
}

