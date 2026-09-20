package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class hc implements xr4 {
    public final Context a;
    public final kc b;
    public final qb c;
    public final LPt8Fixed d = new LPt8Fixed();
    public final F1 e = new F1();
    public final QnHx f = new QnHx();
    public final CQf g = new CQf();
    public final w9<t54> h = w9.H(t54.F1.a);
    public final dw4<sd5> i = new rg3().G();
    public final rg3<sd5> j = new rg3<>();
    public final rg3<yb> k = new rg3<>();

    public final class CQf implements BluetoothProfile.ServiceListener {
        public CQf() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            if (i == 1) {
                hc.this.k.g(new yb.QnHx((BluetoothHeadset) bluetoothProfile));
                return;
            }
            a62.a.l("The bluetooth profile isn't HEADSET: " + i);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceDisconnected(int i) {
            a62.a.e("bluetooth_profile_service_disconnected");
            hc.this.k.g(yb.CQf.a);
        }
    }

    public final class F1 extends BroadcastReceiver {
        public final IntentFilter a;

        public F1() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.a = intentFilter;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1530327060 && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", -1);
                hc.this.i.g(sd5.a);
                a62 a62Var = a62.a;
            }
        }
    }

    public final class LPt8Fixed extends BroadcastReceiver {
        public final IntentFilter a;

        public LPt8Fixed() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            this.a = intentFilter;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.hashCode() == -1692127708 && action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                a62 a62Var = a62.a;
                hc hcVar = hc.this;
                if (intExtra == -1) {
                    hcVar.h.g(t54.LPt8Fixed.a);
                    return;
                }
                if (intExtra == 0) {
                    hcVar.h.g(t54.F1.a);
                } else if (intExtra == 1) {
                    hcVar.h.g(t54.QnHx.a);
                } else {
                    if (intExtra != 2) {
                        return;
                    }
                    hcVar.h.g(t54.CQf.a);
                }
            }
        }
    }

    public final class QnHx extends BroadcastReceiver {
        public final IntentFilter a;

        public QnHx() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            this.a = intentFilter;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1435586571) {
                    if (iHashCode != 545516589 || !action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                        return;
                    }
                } else if (!action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                    return;
                }
                intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("android.bluetooth.device.extra.DEVICE") : null;
                if ((obj instanceof BluetoothDevice ? (BluetoothDevice) obj : null) == null) {
                    a62.a.l("Received an intent with no remote device");
                } else {
                    a62 a62Var = a62.a;
                    hc.this.j.g(sd5.a);
                }
            }
        }
    }

    public hc(Context context, kc kcVar, qb qbVar) {
        this.a = context;
        this.b = kcVar;
        this.c = qbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xr4
    public final qw start() {
        int i = 1;
        ya2 ya2Var = new ya2(new im3(this, i));
        J j = new J(this, i);
        m91.byN byn = m91.d;
        ib2 ib2Var = new ib2(ya2Var, j, byn);
        int i2 = 0;
        vq2 vq2VarN = (ib2Var instanceof p91 ? ((p91) ib2Var).a() : new nb2(ib2Var)).n(new cc(this, i2));
        dc dcVar = new dc(this, i2);
        m91.T23 t23 = m91.c;
        vq2VarN.getClass();
        return new zr2(new jr2(vq2VarN, dcVar, byn, t23).A(j54.b));
    }
}
