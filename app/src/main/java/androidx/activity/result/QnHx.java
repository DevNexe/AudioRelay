package androidx.activity.result;

import android.annotation.SuppressLint;
import android.os.Bundle;
import defpackage.FLr;
import defpackage.PE_;
import defpackage.com9Fixed;
import defpackage.g9D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class QnHx {
    public Random a = new Random();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();
    public final transient HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final Bundle h = new Bundle();

    public static class CQf {
    }

    /* JADX INFO: renamed from: androidx.activity.result.QnHx$QnHx, reason: collision with other inner class name */
    public static class C0016QnHx<O> {
        public final PE_<O> a;
        public final FLr<?, O> b;

        public C0016QnHx(PE_<O> pe_, FLr<?, O> fLr) {
            this.a = pe_;
            this.b = fLr;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.HashMap r0 = r3.f
            java.lang.Object r0 = r0.get(r4)
            androidx.activity.result.QnHx$QnHx r0 = (androidx.activity.result.QnHx.C0016QnHx) r0
            if (r0 == 0) goto L35
            PE_<O> r1 = r0.a
            if (r1 == 0) goto L35
            java.util.ArrayList<java.lang.String> r2 = r3.e
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L35
            FLr<?, O> r0 = r0.b
            java.lang.Object r5 = r0.c(r6, r5)
            r1.b(r5)
            java.util.ArrayList<java.lang.String> r5 = r3.e
            r5.remove(r4)
            goto L44
        L35:
            java.util.HashMap r0 = r3.g
            r0.remove(r4)
            com9Fixed r0 = new com9Fixed
            r0.<init>(r6, r5)
            android.os.Bundle r5 = r3.h
            r5.putParcelable(r4, r0)
        L44:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.QnHx.a(int, int, android.content.Intent):boolean");
    }

    public abstract void b(int i, FLr fLr, @SuppressLint({"UnknownNullness"}) Object obj);

    public final g9D c(String str, FLr fLr, PE_ pe_) {
        int i;
        HashMap map;
        HashMap map2 = this.c;
        if (((Integer) map2.get(str)) == null) {
            int iNextInt = this.a.nextInt(2147418112);
            while (true) {
                i = iNextInt + 65536;
                map = this.b;
                if (!map.containsKey(Integer.valueOf(i))) {
                    break;
                }
                iNextInt = this.a.nextInt(2147418112);
            }
            map.put(Integer.valueOf(i), str);
            map2.put(str, Integer.valueOf(i));
        }
        this.f.put(str, new C0016QnHx(pe_, fLr));
        HashMap map3 = this.g;
        if (map3.containsKey(str)) {
            Object obj = map3.get(str);
            map3.remove(str);
            pe_.b(obj);
        }
        Bundle bundle = this.h;
        com9Fixed com9Var = (com9Fixed) bundle.getParcelable(str);
        if (com9Var != null) {
            bundle.remove(str);
            pe_.b(fLr.c(com9Var.x, com9Var.w));
        }
        return new g9D(this, str, fLr);
    }
}
