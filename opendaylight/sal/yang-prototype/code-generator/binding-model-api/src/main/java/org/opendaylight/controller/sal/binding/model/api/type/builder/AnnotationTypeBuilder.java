/*
 * Copyright (c) 2013 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sal.binding.model.api.type.builder;

import java.util.List;

import org.opendaylight.controller.sal.binding.model.api.AnnotationType;
import org.opendaylight.controller.sal.binding.model.api.Type;

public interface AnnotationTypeBuilder extends Type {
    
    public AnnotationTypeBuilder addAnnotation(final String packageName, final String name);
    
    public boolean addParameter(final String paramName, String value);
    
    public boolean addParameters(final String paramName, List<String> values);
    
    public AnnotationType toInstance();
}