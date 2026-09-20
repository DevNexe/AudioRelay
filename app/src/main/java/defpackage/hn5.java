package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class hn5 implements Runnable {
    public static final String C = s52.e("WorkForegroundRunnable");
    public final j51 A;
    public final c15 B;
    public final pg4<Void> w = new pg4<>();
    public final Context x;
    public final WorkSpec y;
    public final ListenableWorker z;

    public class CQf implements Runnable {
        public final /* synthetic */ pg4 w;

        public CQf(pg4 pg4Var) {
            this.w = pg4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hn5 hn5Var = hn5.this;
            try {
                g51 g51Var = (g51) this.w.get();
                if (g51Var == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", hn5Var.y.c));
                }
                s52 s52VarC = s52.c();
                String str = hn5.C;
                Object[] objArr = new Object[1];
                WorkSpec workSpec = hn5Var.y;
                ListenableWorker listenableWorker = hn5Var.z;
                objArr[0] = workSpec.c;
                s52VarC.a(str, String.format("Updating notification for %s", objArr), new Throwable[0]);
                listenableWorker.setRunInForeground(true);
                pg4<Void> pg4Var = hn5Var.w;
                j51 j51Var = hn5Var.A;
                Context context = hn5Var.x;
                UUID id = listenableWorker.getId();
                jn5 jn5Var = (jn5) j51Var;
                jn5Var.getClass();
                pg4 pg4Var2 = new pg4();
                ((on5) jn5Var.a).a(new in5(jn5Var, pg4Var2, id, g51Var, context));
                pg4Var.k(pg4Var2);
            } catch (Throwable th) {
                hn5Var.w.j(th);
            }
        }
    }

    public class QnHx implements Runnable {
        public final /* synthetic */ pg4 w;

        public QnHx(pg4 pg4Var) {
            this.w = pg4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.w.k(hn5.this.z.getForegroundInfoAsync());
        }
    }

    @SuppressLint({"LambdaLast"})
    public hn5(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, j51 j51Var, c15 c15Var) {
        this.x = context;
        this.y = workSpec;
        this.z = listenableWorker;
        this.A = j51Var;
        this.B = c15Var;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.y.q || zh.a()) {
            this.w.i(null);
            return;
        }
        pg4 pg4Var = new pg4();
        on5 on5Var = (on5) this.B;
        on5Var.c.execute(new QnHx(pg4Var));
        pg4Var.b(new CQf(pg4Var), on5Var.c);
    }
}
