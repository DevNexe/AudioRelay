package com.unity3d.services.core.timer;

import com.facebook.ads.AdError;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.lifecycle.IAppActiveListener;
import com.unity3d.services.core.lifecycle.LifecycleCache;
import com.unity3d.services.core.lifecycle.LifecycleEvent;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class BaseTimer implements IBaseTimer, IAppActiveListener {
    final Integer _delayMs;
    private final AtomicBoolean _hasPaused;
    private final AtomicBoolean _isRunning;
    private final LifecycleCache _lifecycleCache;
    Integer _remainingDurationMs;
    private ScheduledFuture<?> _task;
    private ITimerListener _timerListener;
    private ScheduledExecutorService _timerService;
    final Integer _totalDurationMs;

    /* JADX INFO: renamed from: com.unity3d.services.core.timer.BaseTimer$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent;

        static {
            int[] iArr = new int[LifecycleEvent.values().length];
            $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent = iArr;
            try {
                iArr[LifecycleEvent.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent[LifecycleEvent.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BaseTimer(Integer num, ITimerListener iTimerListener, LifecycleCache lifecycleCache) {
        this._delayMs = Integer.valueOf(AdError.NETWORK_ERROR_CODE);
        this._isRunning = new AtomicBoolean(false);
        this._hasPaused = new AtomicBoolean(false);
        this._totalDurationMs = num;
        this._remainingDurationMs = num;
        this._timerListener = iTimerListener;
        this._lifecycleCache = lifecycleCache;
        if (lifecycleCache != null) {
            lifecycleCache.addListener(this);
        }
    }

    private void notifyListeners() {
        ITimerListener iTimerListener = this._timerListener;
        if (iTimerListener != null) {
            iTimerListener.onTimerFinished();
        }
    }

    private void schedule() {
        try {
            this._task = this._timerService.scheduleAtFixedRate(new Runnable() { // from class: com.unity3d.services.core.timer.BaseTimer.1
                @Override // java.lang.Runnable
                public void run() {
                    BaseTimer baseTimer = BaseTimer.this;
                    baseTimer._remainingDurationMs = Integer.valueOf(baseTimer._remainingDurationMs.intValue() - BaseTimer.this._delayMs.intValue());
                    BaseTimer.this.onStep();
                }
            }, this._delayMs.intValue(), this._delayMs.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e) {
            DeviceLog.debug("ERROR: IntervalTimer failed to start due to exception " + e.getLocalizedMessage());
        }
    }

    public boolean isRunning() {
        return this._isRunning.get();
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void kill() {
        stop();
        LifecycleCache lifecycleCache = this._lifecycleCache;
        if (lifecycleCache != null) {
            lifecycleCache.removeListener(this);
        }
        this._timerListener = null;
    }

    @Override // com.unity3d.services.core.lifecycle.IAppActiveListener
    public void onAppStateChanged(LifecycleEvent lifecycleEvent) {
        int i = AnonymousClass2.$SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent[lifecycleEvent.ordinal()];
        if (i == 1) {
            if (isRunning()) {
                pause();
                this._hasPaused.getAndSet(true);
                return;
            }
            return;
        }
        if (i == 2 && this._hasPaused.get()) {
            this._hasPaused.getAndSet(false);
            resume();
        }
    }

    public void onStep() {
        if (this._remainingDurationMs.intValue() <= 0) {
            notifyListeners();
            kill();
        }
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public boolean pause() {
        boolean z;
        ScheduledFuture<?> scheduledFuture = this._task;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z = false;
        } else {
            z = true;
            this._task.cancel(true);
            this._task = null;
        }
        this._isRunning.getAndSet(false);
        return z;
    }

    public void restart(ScheduledExecutorService scheduledExecutorService) {
        ScheduledExecutorService scheduledExecutorService2 = this._timerService;
        if (scheduledExecutorService2 == null || scheduledExecutorService2.isShutdown()) {
            this._timerService = scheduledExecutorService;
        }
        this._remainingDurationMs = this._totalDurationMs;
        schedule();
        this._isRunning.getAndSet(true);
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public boolean resume() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z = false;
        } else {
            schedule();
            z = true;
        }
        this._isRunning.getAndSet(z);
        return z;
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void start(ScheduledExecutorService scheduledExecutorService) {
        if (this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService;
            schedule();
        }
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void stop() {
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this._timerService.shutdown();
            this._timerService = null;
        }
        this._isRunning.getAndSet(false);
    }

    public BaseTimer(Integer num, ITimerListener iTimerListener) {
        this(num, iTimerListener, CachedLifecycle.getLifecycleListener());
    }
}
