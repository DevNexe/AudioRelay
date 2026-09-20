package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import defpackage.AY;
import defpackage.pp1;
import defpackage.sd5;
import defpackage.u85;
import defpackage.yh3;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class Dispatcher {
    private final ExecutorService executorService;

    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult hTTPResult) {
        }

        public void onError(PurchasesError purchasesError) {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (IOException e) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (SecurityException e2) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e2);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (JSONException e3) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e3);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            }
        }
    }

    public Dispatcher(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        dispatcher.enqueue(runnable, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: enqueue$lambda-2$lambda-1, reason: not valid java name */
    public static final void m10enqueue$lambda2$lambda1(Future future) throws Throwable {
        try {
            future.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(Runnable runnable, boolean z) {
        Future<?> futureSubmit;
        synchronized (this.executorService) {
            if (!this.executorService.isShutdown()) {
                if (z && (this.executorService instanceof ScheduledExecutorService)) {
                    futureSubmit = ((ScheduledExecutorService) this.executorService).schedule(runnable, AY.I(yh3.w, new pp1(0, 5000)), TimeUnit.MILLISECONDS);
                } else {
                    futureSubmit = this.executorService.submit(runnable);
                }
                new Thread(new u85(futureSubmit, 7)).start();
            }
            sd5 sd5Var = sd5.a;
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }
}
