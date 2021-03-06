/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.myfaces.cdi.validator;

import java.util.Objects;
import javax.enterprise.util.AnnotationLiteral;
import javax.faces.validator.FacesValidator;

/**
 *
 */
public class FacesValidatorAnnotationLiteral extends AnnotationLiteral<FacesValidator> implements FacesValidator
{
    private static final long serialVersionUID = 1L;

    private String value;
    private boolean defaultValue;
    private boolean managed;

    public FacesValidatorAnnotationLiteral(String value,boolean defaultValue, boolean managed)
    {
        this.value = value;
        this.defaultValue = defaultValue;
        this.managed = managed;
    }

    @Override
    public String value()
    {
        return value;
    }

    @Override
    public boolean managed()
    {
        return managed;
    }

    @Override
    public boolean isDefault()
    {
        return defaultValue;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.value);
        hash = 79 * hash + (this.defaultValue ? 1 : 0);
        hash = 79 * hash + (this.managed ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final FacesValidatorAnnotationLiteral other = (FacesValidatorAnnotationLiteral) obj;
        if (!Objects.equals(this.value, other.value))
        {
            return false;
        }
        if (this.defaultValue != other.defaultValue)
        {
            return false;
        }
        if (this.managed != other.managed)
        {
            return false;
        }
        return true;
    }

}
