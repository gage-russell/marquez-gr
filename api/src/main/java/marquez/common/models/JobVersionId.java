/* SPDX-License-Identifier: Apache-2.0 */

package marquez.common.models;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/** Version ID for {@code Job}. */
@Value
@Builder
@AllArgsConstructor
public class JobVersionId {
  @NonNull NamespaceName namespace;
  @NonNull JobName name;
  @NonNull UUID version;
}
