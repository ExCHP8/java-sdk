/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.watson.compare_comply.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Row-level cells, each applicable as a header to other cells in the same row as itself, of the
 * current table.
 */
public class RowHeaders extends GenericModel {

  @SerializedName("cell_id")
  protected String cellId;

  protected Location location;
  protected String text;

  @SerializedName("text_normalized")
  protected String textNormalized;

  @SerializedName("row_index_begin")
  protected Long rowIndexBegin;

  @SerializedName("row_index_end")
  protected Long rowIndexEnd;

  @SerializedName("column_index_begin")
  protected Long columnIndexBegin;

  @SerializedName("column_index_end")
  protected Long columnIndexEnd;

  /**
   * Gets the cellId.
   *
   * <p>The unique ID of the cell in the current table.
   *
   * @return the cellId
   */
  public String getCellId() {
    return cellId;
  }

  /**
   * Gets the location.
   *
   * <p>The numeric location of the identified element in the document, represented with two
   * integers labeled `begin` and `end`.
   *
   * @return the location
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Gets the text.
   *
   * <p>The textual contents of this cell from the input document without associated markup content.
   *
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * Gets the textNormalized.
   *
   * <p>If you provide customization input, the normalized version of the cell text according to the
   * customization; otherwise, the same value as `text`.
   *
   * @return the textNormalized
   */
  public String getTextNormalized() {
    return textNormalized;
  }

  /**
   * Gets the rowIndexBegin.
   *
   * <p>The `begin` index of this cell's `row` location in the current table.
   *
   * @return the rowIndexBegin
   */
  public Long getRowIndexBegin() {
    return rowIndexBegin;
  }

  /**
   * Gets the rowIndexEnd.
   *
   * <p>The `end` index of this cell's `row` location in the current table.
   *
   * @return the rowIndexEnd
   */
  public Long getRowIndexEnd() {
    return rowIndexEnd;
  }

  /**
   * Gets the columnIndexBegin.
   *
   * <p>The `begin` index of this cell's `column` location in the current table.
   *
   * @return the columnIndexBegin
   */
  public Long getColumnIndexBegin() {
    return columnIndexBegin;
  }

  /**
   * Gets the columnIndexEnd.
   *
   * <p>The `end` index of this cell's `column` location in the current table.
   *
   * @return the columnIndexEnd
   */
  public Long getColumnIndexEnd() {
    return columnIndexEnd;
  }
}
