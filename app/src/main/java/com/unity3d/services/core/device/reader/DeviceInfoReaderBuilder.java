package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiDataSelector;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceInfoReaderBuilder {
    private final ConfigurationReader _configurationReader;
    private PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderBuilder(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage) {
        this._configurationReader = configurationReader;
        this._privacyConfigStorage = privacyConfigStorage;
    }

    private IExperiments getCurrentExperiments() {
        ConfigurationReader configurationReader = this._configurationReader;
        return (configurationReader == null || configurationReader.getCurrentConfiguration() == null) ? new Experiments() : this._configurationReader.getCurrentConfiguration().getExperiments();
    }

    private JsonFlattenerRules getTsiRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList("privacy", "gdpr", "framework", "adapter", "mediation", "unity", "pipl", "configuration", "user", JsonStorageKeyNames.UNIFIED_CONFIG_KEY), Collections.singletonList("value"), Arrays.asList("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }

    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        Storage storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        JsonStorageAggregator jsonStorageAggregator = new JsonStorageAggregator(Arrays.asList(storage2, storage));
        DeviceInfoReaderFilterProvider deviceInfoReaderFilterProvider = new DeviceInfoReaderFilterProvider(storage);
        DeviceInfoReaderWithStorageInfo deviceInfoReaderWithStorageInfo = new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithLifecycle(new DeviceInfoReaderExtended(buildWithRequestType(InitRequestType.TOKEN)), CachedLifecycle.getLifecycleListener()), getTsiRequestStorageRules(), storage, storage2);
        PiiTrackingStatusReader piiTrackingStatusReader = new PiiTrackingStatusReader(jsonStorageAggregator);
        return new DeviceInfoReaderWithMetrics(new DeviceInfoReaderWithFilter((this._privacyConfigStorage == null || !getCurrentExperiments().isPrivacyRequestEnabled()) ? new DeviceInfoReaderWithPII(deviceInfoReaderWithStorageInfo, new PiiDataSelector(piiTrackingStatusReader, storage, getCurrentExperiments()), new PiiDataProvider()) : new DeviceInfoReaderWithPrivacy(deviceInfoReaderWithStorageInfo, this._privacyConfigStorage, new PiiDataProvider(), piiTrackingStatusReader), deviceInfoReaderFilterProvider.getFilterList()));
    }

    public IDeviceInfoReader buildWithRequestType(InitRequestType initRequestType) {
        return new DeviceInfoReaderWithRequestType(new MinimalDeviceInfoReader(), initRequestType);
    }
}
