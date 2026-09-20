package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.timer.ITimerListener;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class LoadModuleDecoratorTimeout extends LoadModuleDecorator {
    private static final String errorMsgTimeoutLoading = "[UnityAds] Timeout while loading ";
    private final ExecutorService _executorService;
    private final boolean _useNewTimer;

    public LoadModuleDecoratorTimeout(ILoadModule iLoadModule, ConfigurationReader configurationReader) {
        super(iLoadModule);
        this._executorService = Executors.newCachedThreadPool();
        this._useNewTimer = configurationReader.getCurrentConfiguration().getExperiments().isNewLifecycleTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOperationTimeout(LoadOperationState loadOperationState) {
        if (loadOperationState != null) {
            getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(AdOperationError.timeout, Long.valueOf(loadOperationState.duration())));
            remove(loadOperationState.id);
            loadOperationState.onUnityAdsFailedToLoad(UnityAds.UnityAdsLoadError.TIMEOUT, errorMsgTimeoutLoading + loadOperationState.placementId);
        }
    }

    private void releaseOperationTimeoutLock(String str) {
        LoadOperationState loadOperationState;
        ILoadOperation iLoadOperation = get(str);
        if (iLoadOperation == null || (loadOperationState = iLoadOperation.getLoadOperationState()) == null) {
            return;
        }
        if (!this._useNewTimer) {
            if (iLoadOperation.getLoadOperationState().timeoutCV == null) {
                return;
            }
            iLoadOperation.getLoadOperationState().timeoutCV.open();
        } else {
            BaseTimer baseTimer = loadOperationState.timeoutTimer;
            if (baseTimer == null) {
                return;
            }
            baseTimer.kill();
        }
    }

    private void startLoadTimeout(final LoadOperationState loadOperationState) {
        if (!this._useNewTimer) {
            this._executorService.submit(new Runnable() { // from class: com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout.2
                @Override // java.lang.Runnable
                public void run() {
                    LoadOperationState loadOperationState2 = loadOperationState;
                    if (loadOperationState2.timeoutCV.block(loadOperationState2.configuration.getLoadTimeout())) {
                        return;
                    }
                    LoadModuleDecoratorTimeout.this.onOperationTimeout(loadOperationState);
                }
            });
        } else {
            if (loadOperationState == null) {
                return;
            }
            BaseTimer baseTimer = new BaseTimer(Integer.valueOf(loadOperationState.configuration.getLoadTimeout()), new ITimerListener() { // from class: com.unity3d.services.ads.operation.load.LoadModuleDecoratorTimeout.1
                @Override // com.unity3d.services.core.timer.ITimerListener
                public void onTimerFinished() {
                    LoadModuleDecoratorTimeout.this.onOperationTimeout(loadOperationState);
                }
            });
            loadOperationState.timeoutTimer = baseTimer;
            baseTimer.start(Executors.newSingleThreadScheduledExecutor());
        }
    }

    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsAdLoaded(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsAdLoaded(str);
    }

    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.unity3d.services.ads.operation.load.LoadModuleDecorator, com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, LoadOperationState loadOperationState) {
        getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadStart());
        loadOperationState.start();
        startLoadTimeout(loadOperationState);
        super.executeAdOperation(iWebViewBridgeInvoker, loadOperationState);
    }
}
