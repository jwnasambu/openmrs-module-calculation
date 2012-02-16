/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation.evaluator;

import org.openmrs.calculation.Calculation;
import org.openmrs.calculation.result.Result;

/**
 * A CalculationEvaluator is responsible for evaluating one or more types of {@link Calculation}s
 * into {@link Result}s. This is where the bulk of all calculations occur, either by performing
 * these calculations directly within the evaluator, or by delegating to service methods that
 * perform calculations.
 */
public interface CalculationEvaluator {

}