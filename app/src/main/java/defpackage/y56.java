package defpackage;

import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbtr;
import com.google.android.gms.internal.ads.zzcgn;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y56 implements zzbpq {
    public final /* synthetic */ zzbsm a;
    public final /* synthetic */ zzca b;
    public final /* synthetic */ zzbtr c;

    public y56(zzbtr zzbtrVar, zzbsu zzbsuVar, zzca zzcaVar) {
        this.c = zzbtrVar;
        this.a = zzbsuVar;
        this.b = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbpq, java.lang.Object] */
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
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.c.a) {
            zzcgn.zzi("JS Engine is requesting an update");
            if (this.c.i == 0) {
                zzcgn.zzi("Starting reload.");
                zzbtr zzbtrVar = this.c;
                zzbtrVar.i = 2;
                zzbtrVar.a();
            }
            this.a.zzr("/requestReload", this.b.zza());
        }
    }
}
