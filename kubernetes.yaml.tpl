# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

apiVersion: apps/v1
kind: Deployment
metadata:
  name: payment-processing
  labels:
    app: payment-processing
spec:
  replicas: 1
  selector:
    matchLabels:
      app: payment-processing
  template:
    metadata:
      labels:
        app: payment-processing
    spec:
      containers:
      - name: payment-processing
        image: gcr.io/GOOGLE_CLOUD_PROJECT/payment-processing:COMMIT_SHA
        ports:
        - containerPort: 8282
---
kind: Service
apiVersion: v1
metadata:
  name: payment-processing
spec:
  selector:
    app: payment-processing
  ports:
  - protocol: TCP
    port: 8282
    targetPort: 8282
  type: LoadBalancer