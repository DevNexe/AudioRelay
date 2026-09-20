package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import defpackage.c15;
import defpackage.do5;
import defpackage.g51;
import defpackage.if3;
import defpackage.in5;
import defpackage.j42;
import defpackage.j51;
import defpackage.jn5;
import defpackage.on5;
import defpackage.pg4;
import defpackage.tn5;
import defpackage.un5;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {
    public boolean A;
    public final Context w;
    public final WorkerParameters x;
    public volatile boolean y;
    public boolean z;

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && CQf.class == obj.getClass();
            }

            public final int hashCode() {
                return CQf.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        public static final class F1 extends QnHx {
            public final androidx.work.CQf a;

            public F1() {
                this(androidx.work.CQf.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || F1.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((F1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (F1.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public F1(androidx.work.CQf cQf) {
                this.a = cQf;
            }
        }

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0031QnHx extends QnHx {
            public final androidx.work.CQf a = androidx.work.CQf.c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0031QnHx.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0031QnHx) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() + (C0031QnHx.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.w = context;
        this.x = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.w;
    }

    public Executor getBackgroundExecutor() {
        return this.x.f;
    }

    public j42<g51> getForegroundInfoAsync() {
        pg4 pg4Var = new pg4();
        pg4Var.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return pg4Var;
    }

    public final UUID getId() {
        return this.x.a;
    }

    public final CQf getInputData() {
        return this.x.b;
    }

    public final Network getNetwork() {
        return this.x.d.c;
    }

    public final int getRunAttemptCount() {
        return this.x.e;
    }

    public final Set<String> getTags() {
        return this.x.c;
    }

    public c15 getTaskExecutor() {
        return this.x.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.x.d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.x.d.b;
    }

    public do5 getWorkerFactory() {
        return this.x.h;
    }

    public boolean isRunInForeground() {
        return this.A;
    }

    public final boolean isStopped() {
        return this.y;
    }

    public final boolean isUsed() {
        return this.z;
    }

    public void onStopped() {
    }

    public final j42<Void> setForegroundAsync(g51 g51Var) {
        this.A = true;
        j51 j51Var = this.x.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        jn5 jn5Var = (jn5) j51Var;
        jn5Var.getClass();
        pg4 pg4Var = new pg4();
        ((on5) jn5Var.a).a(new in5(jn5Var, pg4Var, id, g51Var, applicationContext));
        return pg4Var;
    }

    public j42<Void> setProgressAsync(CQf cQf) {
        if3 if3Var = this.x.i;
        getApplicationContext();
        UUID id = getId();
        un5 un5Var = (un5) if3Var;
        un5Var.getClass();
        pg4 pg4Var = new pg4();
        ((on5) un5Var.b).a(new tn5(un5Var, id, cQf, pg4Var));
        return pg4Var;
    }

    public void setRunInForeground(boolean z) {
        this.A = z;
    }

    public final void setUsed() {
        this.z = true;
    }

    public abstract j42<QnHx> startWork();

    public final void stop() {
        this.y = true;
        onStopped();
    }
}
