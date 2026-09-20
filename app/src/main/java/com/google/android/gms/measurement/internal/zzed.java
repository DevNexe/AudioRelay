package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbn;
import defpackage.bi6;
import defpackage.d37;
import defpackage.ft5;
import defpackage.h37;
import defpackage.iq5;
import defpackage.m16;
import defpackage.m37;
import defpackage.oa3;
import defpackage.p87;
import defpackage.p97;
import defpackage.px5;
import defpackage.r27;
import defpackage.w46;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzed extends zzbn implements zzee {
    public zzed() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        ArrayList arrayList;
        switch (i) {
            case 1:
                m16 m16Var = (m16) w46.a(parcel, m16.CREATOR);
                p97 p97Var = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).I0(m16Var, p97Var);
                parcel2.writeNoException();
                return true;
            case 2:
                d37 d37Var = (d37) w46.a(parcel, d37.CREATOR);
                p97 p97Var2 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).L(d37Var, p97Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                p97 p97Var3 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).J(p97Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                m16 m16Var2 = (m16) w46.a(parcel, m16.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                w46.b(parcel);
                zzgq zzgqVar = (zzgq) this;
                oa3.h(m16Var2);
                oa3.e(string);
                zzgqVar.O0(string, true);
                zzgqVar.M0(new px5(zzgqVar, m16Var2, string, 3, 0));
                parcel2.writeNoException();
                return true;
            case 6:
                p97 p97Var4 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).D(p97Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                p97 p97Var5 = (p97) w46.a(parcel, p97.CREATOR);
                z = parcel.readInt() != 0;
                w46.b(parcel);
                zzgq zzgqVar2 = (zzgq) this;
                zzgqVar2.N0(p97Var5);
                String str = p97Var5.w;
                oa3.h(str);
                r27 r27Var = zzgqVar2.w;
                try {
                    List<h37> list = (List) r27Var.zzaz().k(new p87(3, zzgqVar2, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (h37 h37Var : list) {
                        if (z || !m37.P(h37Var.c)) {
                            arrayList.add(new d37(h37Var));
                        }
                        break;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    r27Var.zzay().f.d(bi6.n(str), "Failed to get user properties. appId", e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                m16 m16Var3 = (m16) w46.a(parcel, m16.CREATOR);
                String string2 = parcel.readString();
                w46.b(parcel);
                byte[] bArrV0 = ((zzgq) this).v0(m16Var3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrV0);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                w46.b(parcel);
                ((zzgq) this).V(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                p97 p97Var6 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                String strD = ((zzgq) this).d(p97Var6);
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 12:
                ft5 ft5Var = (ft5) w46.a(parcel, ft5.CREATOR);
                p97 p97Var7 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).O(ft5Var, p97Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                ft5 ft5Var2 = (ft5) w46.a(parcel, ft5.CREATOR);
                w46.b(parcel);
                zzgq zzgqVar3 = (zzgq) this;
                oa3.h(ft5Var2);
                oa3.h(ft5Var2.y);
                oa3.e(ft5Var2.w);
                zzgqVar3.O0(ft5Var2.w, true);
                zzgqVar3.M0(new iq5(8, zzgqVar3, new ft5(ft5Var2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = w46.a;
                z = parcel.readInt() != 0;
                p97 p97Var8 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                List listM0 = ((zzgq) this).m0(string6, string7, z, p97Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM0);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = w46.a;
                z = parcel.readInt() != 0;
                w46.b(parcel);
                List listM = ((zzgq) this).m(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                p97 p97Var9 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                List listP = ((zzgq) this).P(string11, string12, p97Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                w46.b(parcel);
                List listC = ((zzgq) this).C(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC);
                return true;
            case 18:
                p97 p97Var10 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).A(p97Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) w46.a(parcel, Bundle.CREATOR);
                p97 p97Var11 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).s(bundle, p97Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                p97 p97Var12 = (p97) w46.a(parcel, p97.CREATOR);
                w46.b(parcel);
                ((zzgq) this).h0(p97Var12);
                parcel2.writeNoException();
                return true;
        }
    }
}
