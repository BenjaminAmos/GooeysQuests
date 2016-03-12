/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.gooeysQuests;

import com.google.common.collect.ImmutableMap;
import org.terasology.persistence.typeHandling.DeserializationContext;
import org.terasology.persistence.typeHandling.PersistedData;
import org.terasology.persistence.typeHandling.RegisterTypeHandler;
import org.terasology.persistence.typeHandling.SerializationContext;
import org.terasology.persistence.typeHandling.SimpleTypeHandler;

import java.util.Map;

/**
 *
 */
@RegisterTypeHandler
public class FollowActionTypeHandler extends SimpleTypeHandler<FollowAction> {

    public FollowActionTypeHandler() {
    }

    @Override
    public PersistedData serialize(FollowAction action, SerializationContext context) {
        Map<String, PersistedData> data = ImmutableMap.of(
                "type", context.create(action.getClass().getSimpleName())
        );

        return context.create(data);
    }

    @Override
    public FollowAction deserialize(PersistedData data, DeserializationContext context) {
        return new FollowAction();
    }
}
