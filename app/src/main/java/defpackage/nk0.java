package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.RBi;
import androidx.fragment.app.RBi.y;
import androidx.fragment.app.Xn1;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public class nk0 extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public Handler o0;
    public boolean x0;
    public Dialog z0;
    public final QnHx p0 = new QnHx();
    public final CQf q0 = new CQf();
    public final F1 r0 = new F1();
    public int s0 = 0;
    public int t0 = 0;
    public boolean u0 = true;
    public boolean v0 = true;
    public int w0 = -1;
    public final LPt8Fixed y0 = new LPt8Fixed();
    public boolean D0 = false;

    public class CQf implements DialogInterface.OnCancelListener {
        public CQf() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            nk0 nk0Var = nk0.this;
            Dialog dialog = nk0Var.z0;
            if (dialog != null) {
                nk0Var.onCancel(dialog);
            }
        }
    }

    public class F1 implements DialogInterface.OnDismissListener {
        public F1() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            nk0 nk0Var = nk0.this;
            Dialog dialog = nk0Var.z0;
            if (dialog != null) {
                nk0Var.onDismiss(dialog);
            }
        }
    }

    public class LPt8Fixed implements it2<d32> {
        public LPt8Fixed() {
        }
    }

    public class NUlFixed extends B8C {
        public final /* synthetic */ B8C w;

        public NUlFixed(Fragment.QnHx qnHx) {
            this.w = qnHx;
        }

        @Override // defpackage.B8C
        public final View I0(int i) {
            B8C b8c = this.w;
            if (b8c.L0()) {
                return b8c.I0(i);
            }
            Dialog dialog = nk0.this.z0;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        @Override // defpackage.B8C
        public final boolean L0() {
            return this.w.L0() || nk0.this.D0;
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            nk0 nk0Var = nk0.this;
            nk0Var.r0.onDismiss(nk0Var.z0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void A() {
        this.Y = true;
        Dialog dialog = this.z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void B(Bundle bundle) {
        Bundle bundle2;
        this.Y = true;
        if (this.z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.z0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.C(layoutInflater, viewGroup, bundle);
        if (this.a0 != null || this.z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.z0.onRestoreInstanceState(bundle2);
    }

    public final void N(boolean z, boolean z2) {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        this.C0 = false;
        Dialog dialog = this.z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.z0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.o0.getLooper()) {
                    onDismiss(this.z0);
                } else {
                    this.o0.post(this.p0);
                }
            }
        }
        this.A0 = true;
        if (this.w0 >= 0) {
            RBi rBiL = l();
            int i = this.w0;
            if (i < 0) {
                throw new IllegalArgumentException(GM.a("Bad id: ", i));
            }
            rBiL.v(rBiL.new y(i), false);
            this.w0 = -1;
            return;
        }
        androidx.fragment.app.QnHx qnHx = new androidx.fragment.app.QnHx(l());
        RBi rBi = this.N;
        if (rBi != null && rBi != qnHx.p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        qnHx.b(new Xn1.QnHx(3, this));
        if (z) {
            qnHx.d(true);
        } else {
            qnHx.d(false);
        }
    }

    public Dialog O() {
        if (RBi.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(I(), this.t0);
    }

    public final Dialog P() {
        Dialog dialog = this.z0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.Fragment
    public final B8C f() {
        return new NUlFixed(new Fragment.QnHx());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A0) {
            return;
        }
        if (RBi.H(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        N(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void q(Context context) {
        super.q(context);
        this.j0.d(this.y0);
        if (this.C0) {
            return;
        }
        this.B0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void r(Bundle bundle) {
        super.r(bundle);
        this.o0 = new Handler();
        this.v0 = this.S == 0;
        if (bundle != null) {
            this.s0 = bundle.getInt("android:style", 0);
            this.t0 = bundle.getInt("android:theme", 0);
            this.u0 = bundle.getBoolean("android:cancelable", true);
            this.v0 = bundle.getBoolean("android:showsDialog", this.v0);
            this.w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void u() {
        this.Y = true;
        Dialog dialog = this.z0;
        if (dialog != null) {
            this.A0 = true;
            dialog.setOnDismissListener(null);
            this.z0.dismiss();
            if (!this.B0) {
                onDismiss(this.z0);
            }
            this.z0 = null;
            this.D0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void v() {
        this.Y = true;
        if (!this.C0 && !this.B0) {
            this.B0 = true;
        }
        this.j0.g(this.y0);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater w(Bundle bundle) {
        LayoutInflater layoutInflaterW = super.w(bundle);
        boolean z = this.v0;
        if (!z || this.x0) {
            if (RBi.H(2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.v0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return layoutInflaterW;
        }
        if (z && !this.D0) {
            try {
                this.x0 = true;
                Dialog dialogO = O();
                this.z0 = dialogO;
                if (this.v0) {
                    int i = this.s0;
                    if (i == 1 || i == 2) {
                        dialogO.requestWindowFeature(1);
                    } else if (i == 3) {
                        Window window = dialogO.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogO.requestWindowFeature(1);
                    }
                    Context contextJ = j();
                    if (contextJ instanceof Activity) {
                        this.z0.setOwnerActivity((Activity) contextJ);
                    }
                    this.z0.setCancelable(this.u0);
                    this.z0.setOnCancelListener(this.q0);
                    this.z0.setOnDismissListener(this.r0);
                    this.D0 = true;
                } else {
                    this.z0 = null;
                }
                this.x0 = false;
            } catch (Throwable th) {
                this.x0 = false;
                throw th;
            }
        }
        if (RBi.H(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.z0;
        return dialog != null ? layoutInflaterW.cloneInContext(dialog.getContext()) : layoutInflaterW;
    }

    @Override // androidx.fragment.app.Fragment
    public void y(Bundle bundle) {
        Dialog dialog = this.z0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.s0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.t0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.u0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.v0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.w0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z() {
        this.Y = true;
        Dialog dialog = this.z0;
        if (dialog != null) {
            this.A0 = false;
            dialog.show();
            View decorView = this.z0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            tj5.b(decorView, this);
        }
    }
}
