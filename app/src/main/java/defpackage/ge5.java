package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.activity.ComponentActivity;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ge5 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ge5.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ ComponentActivity w;
        public final /* synthetic */ long x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ComponentActivity componentActivity, long j) {
            super(1);
            this.w = componentActivity;
            this.x = j;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            ComponentActivity componentActivity = this.w;
            componentActivity.setTaskDescription(ge5.b(componentActivity, this.x));
            return new fe5();
        }
    }

    public static final void a(g30 g30Var, int i) {
        ComponentActivity componentActivityX;
        j30 j30VarQ = g30Var.q(1340101865);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1960602922);
            long j = ((rv) j30VarQ.E(sv.a)).l() ? Zr_O.k : Zr_O.a;
            j30VarQ.R(false);
            Context context = (Context) j30VarQ.E(Ll.b);
            if (context instanceof ComponentActivity) {
                componentActivityX = (ComponentActivity) context;
            } else {
                if (!(context instanceof ContextWrapper)) {
                    throw new IllegalStateException(("Unexpected context type " + nl3.a(context.getClass()).a()).toString());
                }
                componentActivityX = FWT.x(((ContextWrapper) context).getBaseContext());
            }
            wq0.b(componentActivityX, new yu(j), new QnHx(componentActivityX, j), j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }

    public static final ActivityManager.TaskDescription b(ComponentActivity componentActivity, long j) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return new ActivityManager.TaskDescription.Builder().setLabel(componentActivity.getString(R.string.app_name)).setIcon(R.mipmap.ic_launcher).setBackgroundColor(hH.A(j)).build();
        }
        if (i >= 28) {
            return new ActivityManager.TaskDescription(componentActivity.getString(R.string.app_name), R.mipmap.ic_launcher, hH.A(j));
        }
        return new ActivityManager.TaskDescription(componentActivity.getString(R.string.app_name), BitmapFactory.decodeResource(componentActivity.getResources(), R.mipmap.ic_launcher), hH.A(j));
    }
}
