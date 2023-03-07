/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.watson.speech_to_text.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.List;

/** Information about a word from a custom language model. */
public class Word extends GenericModel {

  protected String word;

  @SerializedName("sounds_like")
  protected List<String> soundsLike;

  @SerializedName("display_as")
  protected String displayAs;

  protected Long count;
  protected List<String> source;
  protected List<WordError> error;

  protected Word() {}

  /**
   * Gets the word.
   *
   * <p>A word from the custom model's words resource. The spelling of the word is used to train the
   * model.
   *
   * @return the word
   */
  public String getWord() {
    return word;
  }

  /**
   * Gets the soundsLike.
   *
   * <p>An array of as many as five pronunciations for the word. * _For a custom model that is based
   * on a previous-generation model_, in addition to sounds-like pronunciations that were added by a
   * user, the array can include a sounds-like pronunciation that is automatically generated by the
   * service if none is provided when the word is added to the custom model. * _For a custom model
   * that is based on a next-generation model_, the array can include only sounds-like
   * pronunciations that were added by a user.
   *
   * @return the soundsLike
   */
  public List<String> getSoundsLike() {
    return soundsLike;
  }

  /**
   * Gets the displayAs.
   *
   * <p>The spelling of the word that the service uses to display the word in a transcript. * _For a
   * custom model that is based on a previous-generation model_, the field can contain an empty
   * string if no display-as value is provided for a word that exists in the service's base
   * vocabulary. In this case, the word is displayed as it is spelled. * _For a custom model that is
   * based on a next-generation model_, the service uses the spelling of the word as the value of
   * the display-as field when the word is added to the model.
   *
   * @return the displayAs
   */
  public String getDisplayAs() {
    return displayAs;
  }

  /**
   * Gets the count.
   *
   * <p>_For a custom model that is based on a previous-generation model_, a sum of the number of
   * times the word is found across all corpora and grammars. For example, if the word occurs five
   * times in one corpus and seven times in another, its count is `12`. If you add a custom word to
   * a model before it is added by any corpora or grammars, the count begins at `1`; if the word is
   * added from a corpus or grammar first and later modified, the count reflects only the number of
   * times it is found in corpora and grammars.
   *
   * <p>_For a custom model that is based on a next-generation model_, the `count` field for any
   * word is always `1`.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the source.
   *
   * <p>An array of sources that describes how the word was added to the custom model's words
   * resource. * _For a custom model that is based on previous-generation model,_ the field includes
   * the name of each corpus and grammar from which the service extracted the word. For OOV that are
   * added by multiple corpora or grammars, the names of all corpora and grammars are listed. If you
   * modified or added the word directly, the field includes the string `user`. * _For a custom
   * model that is based on a next-generation model,_ this field shows only `user` for custom words
   * that were added directly to the custom model. Words from corpora and grammars are not added to
   * the words resource for custom models that are based on next-generation models.
   *
   * @return the source
   */
  public List<String> getSource() {
    return source;
  }

  /**
   * Gets the error.
   *
   * <p>If the service discovered one or more problems that you need to correct for the word's
   * definition, an array that describes each of the errors.
   *
   * @return the error
   */
  public List<WordError> getError() {
    return error;
  }
}
