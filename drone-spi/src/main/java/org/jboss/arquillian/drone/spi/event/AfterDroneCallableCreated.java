/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.drone.spi.event;

import java.lang.annotation.Annotation;
import java.util.concurrent.Callable;

import org.jboss.arquillian.drone.spi.DroneContext;
import org.jboss.arquillian.drone.spi.InstanceOrCallableInstance;

/**
 * This event is fired after Drone instance callable is created and stored in {@link DroneContext}.
 *
 * By modifying the {@link Callable} you can change way how Drone instance will be created.
 *
 * @author <a href="mailto:kpiwko@redhat.com">Karel Piwko</a>
 *
 */
public class AfterDroneCallableCreated extends BaseDroneEvent implements DroneLifecycleEvent {

    private final InstanceOrCallableInstance instanceCallable;

    public AfterDroneCallableCreated(InstanceOrCallableInstance instanceCallable, Class<?> droneType,
            Class<? extends Annotation> qualifier) {
        super(droneType, qualifier);
        this.instanceCallable = instanceCallable;
    }

    public InstanceOrCallableInstance getInstanceCallable() {
        return instanceCallable;
    }
}
