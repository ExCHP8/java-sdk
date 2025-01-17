/*
 * (C) Copyright IBM Corp. 2023, 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.watson.discovery.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.List;
import java.util.Map;

/** Result for the `pair` aggregation. */
public class QueryPairAggregationResult extends GenericModel {

  protected List<Map<String, Object>> aggregations;

  protected QueryPairAggregationResult() {}

  /**
   * Gets the aggregations.
   *
   * <p>Array of subaggregations of type `term`, `group_by`, `histogram`, or `timeslice`. Each
   * element of the matrix that is returned contains a **relevancy** value that is calculated from
   * the combination of each value from the first and second aggregations.
   *
   * @return the aggregations
   */
  public List<Map<String, Object>> getAggregations() {
    return aggregations;
  }
}
