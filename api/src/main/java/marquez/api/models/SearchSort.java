/* SPDX-License-Identifier: Apache-2.0 */

package marquez.api.models;

/** Sort supported for {@link SearchResult}. */
public enum SearchSort {
  NAME("name"),
  UPDATE_AT("updated_at");

  final String value;

  SearchSort(String value) {
    this.value = value;
  }
}
