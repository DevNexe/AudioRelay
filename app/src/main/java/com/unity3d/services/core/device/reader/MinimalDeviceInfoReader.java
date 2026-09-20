package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap map = new HashMap();
        map.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        map.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        map.put("sdkVersionName", SdkProperties.getVersionName());
        map.put("idfi", Device.getIdfi());
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("gameId", ClientProperties.getGameId());
        return map;
    }
}
