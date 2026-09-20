package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class go implements x55 {
    public final View a;
    public ActionMode b;
    public final p15 c = new p15(new QnHx());
    public int d = 2;

    public static final class QnHx extends cx1 implements h81<sd5> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            go.this.b = null;
            return sd5.a;
        }
    }

    public go(View view) {
        this.a = view;
    }

    @Override // defpackage.x55
    public final void a() {
        this.d = 2;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.b = null;
    }

    @Override // defpackage.x55
    public final void b(dl3 dl3Var, h81<sd5> h81Var, h81<sd5> h81Var2, h81<sd5> h81Var3, h81<sd5> h81Var4) {
        p15 p15Var = this.c;
        p15Var.B = dl3Var;
        p15Var.x = h81Var;
        p15Var.z = h81Var3;
        p15Var.y = h81Var2;
        p15Var.A = h81Var4;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.d = 1;
        int i = Build.VERSION.SDK_INT;
        View view = this.a;
        this.b = i >= 23 ? y55.a.b(view, new kz0(p15Var), 1) : view.startActionMode(new ae3(p15Var));
    }

    @Override // defpackage.x55
    public final int c() {
        return this.d;
    }
}
