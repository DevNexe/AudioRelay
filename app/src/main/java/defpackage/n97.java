package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzee;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n97 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public n97(u07 u07Var, String str, String str2, p97 p97Var, zzcf zzcfVar) {
        this.B = u07Var;
        this.x = str;
        this.y = str2;
        this.z = p97Var;
        this.A = zzcfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3, types: [dq6] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8, types: [dq6] */
    /* JADX WARN: Type inference failed for: r1v9, types: [m37, sv6] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        ?? r1 = this.B;
        ?? r2 = this.A;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                yb7 yb7Var = (yb7) obj3;
                Activity activity = (Activity) obj2;
                s60 s60Var = (s60) obj;
                r60.CQf cQf = (r60.CQf) r2;
                r60.QnHx qnHx = (r60.QnHx) r1;
                Handler handler = yb7Var.b;
                int i2 = 7;
                try {
                    s60Var.getClass();
                    String strA = n66.a(yb7Var.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 95);
                    sb.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                    sb.append(strA);
                    sb.append("\") to set this as a debug device.");
                    Log.i("UserMessagingPlatform", sb.toString());
                    tp1 tp1VarB = new ss5(yb7Var.g, yb7Var.a(yb7Var.f.a(activity, s60Var))).b();
                    yb7Var.d.b.edit().putInt("consent_status", tp1VarB.a).apply();
                    yb7Var.e.a.set((o36) tp1VarB.b);
                    yb7Var.h.a.execute(new tb7(i2, yb7Var, cQf));
                    return;
                } catch (zzj e) {
                    handler.post(new ta7(8, qnHx, e));
                    return;
                } catch (RuntimeException e2) {
                    String strValueOf = String.valueOf(Log.getStackTraceString(e2));
                    handler.post(new iq5(qnHx, new zzj(1, strValueOf.length() != 0 ? "Caught exception when trying to request consent info update: ".concat(strValueOf) : new String("Caught exception when trying to request consent info update: ")), i2));
                    return;
                }
            default:
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        u07 u07Var = (u07) r1;
                        zzee zzeeVar = u07Var.d;
                        if (zzeeVar == null) {
                            bi6 bi6Var = u07Var.a.i;
                            dq6.h(bi6Var);
                            bi6Var.f.d((String) obj3, "Failed to get conditional properties; not connected to service", (String) obj2);
                            r1 = ((u07) r1).a;
                        } else {
                            oa3.h((p97) obj);
                            arrayList = m37.o(zzeeVar.P((String) obj3, (String) obj2, (p97) obj));
                            ((u07) r1).p();
                            r1 = ((u07) r1).a;
                        }
                        break;
                    } catch (RemoteException e3) {
                        bi6 bi6Var2 = ((u07) r1).a.i;
                        dq6.h(bi6Var2);
                        bi6Var2.f.e("Failed to get conditional properties; remote exception", (String) obj3, (String) obj2, e3);
                        r1 = ((u07) r1).a;
                    }
                    r1 = r1.l;
                    return;
                } finally {
                    m37 m37Var = ((u07) r1).a.l;
                    dq6.f(m37Var);
                    m37Var.x((zzcf) r2, arrayList);
                }
        }
    }

    public /* synthetic */ n97(yb7 yb7Var, Activity activity, s60 s60Var, Z7O z7o, gcF gcf) {
        this.x = yb7Var;
        this.y = activity;
        this.z = s60Var;
        this.A = z7o;
        this.B = gcf;
    }
}
