/*
 * Copyright 2017-2018, EnMasse authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.enmasse.controller.standard;

import io.enmasse.k8s.api.EventLogger;

public enum ControllerReason implements EventLogger.Reason {
    BrokerCreated,
    BrokerCreateFailed,
    RouterCheckFailed,
    BrokerDeleted,
    BrokerDeleteFailed,
    AddressSyncFailed;
}
