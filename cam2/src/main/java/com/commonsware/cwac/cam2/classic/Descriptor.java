/***
 Copyright (c) 2015 CommonsWare, LLC

 Licensed under the Apache License, Version 2.0 (the "License"); you may
 not use this file except in compliance with the License. You may obtain
 a copy of the License at http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.commonsware.cwac.cam2.classic;

import android.hardware.Camera;
import com.commonsware.cwac.cam2.CameraDescriptor;

class Descriptor implements CameraDescriptor {
  private int cameraId;
  private Camera camera;

  Descriptor(int cameraId) {
    this.cameraId=cameraId;
  }

  int getCameraId() {
    return(cameraId);
  }

  void setCamera(Camera camera) {
    this.camera=camera;
  }

  Camera getCamera() {
    return(camera);
  }
}
