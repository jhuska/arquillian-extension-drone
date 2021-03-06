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

import org.jboss.arquillian.drone.spi.InstanceOrCallableInstance;
import org.jboss.arquillian.drone.spi.Instantiator;

/**
 * This event is fired before Drone {@link Callable} is transformed into real instance via {@link Instantiator}. It is supposed
 * that it will always contain a {@link Callable} instance.
 *
 * @author <a href="mailto:kpiwko@redhat.com">Karel Piwko</a>
 *
 */
public class BeforeDroneInstantiated extends BaseDroneEvent implements DroneLifecycleEvent {

    private final InstanceOrCallableInstance instanceCallable;

    public BeforeDroneInstantiated(InstanceOrCallableInstance instanceCallable, Class<?> droneType,
            Class<? extends Annotation> qualifier) {
        super(droneType, qualifier);
        this.instanceCallable = instanceCallable;
    }

    public InstanceOrCallableInstance getInstanceCallable() {
        return instanceCallable;
    }
}
