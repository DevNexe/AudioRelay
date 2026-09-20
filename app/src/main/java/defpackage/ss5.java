package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.zzain;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzej;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzyp;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzj;
import com.google.android.gms.internal.ads.zzzn;
import com.google.android.gms.internal.ads.zzzo;
import com.google.android.gms.internal.ads.zzzs;
import com.google.android.gms.internal.consent_sdk.zzj;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ss5 implements zzyq, nr4 {
    public final /* synthetic */ int w;
    public int x;
    public final Object y;
    public final Object z;

    public ss5(e61 e61Var, i66 i66Var) {
        this.w = 2;
        this.x = 0;
        this.y = e61Var;
        this.z = i66Var;
    }

    @Override // defpackage.nr4
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.x) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (nr4 nr4Var : (nr4[]) this.y) {
            if (stackTraceElementArrA.length <= this.x) {
                break;
            }
            stackTraceElementArrA = nr4Var.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.x ? ((kg2) this.z).a(stackTraceElementArrA) : stackTraceElementArrA;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    public final tp1 b() throws zzj {
        final String str;
        i66 i66Var = (i66) this.z;
        int i = i66Var.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.x = 3;
                break;
            case 4:
                this.x = 2;
                break;
            case 5:
                this.x = 1;
                break;
            case 6:
                String strValueOf = String.valueOf(i66Var.c);
                throw new zzj(1, strValueOf.length() != 0 ? "Invalid response from server: ".concat(strValueOf) : new String("Invalid response from server: "));
            case 7:
                String strValueOf2 = String.valueOf(i66Var.c);
                throw new zzj(3, strValueOf2.length() != 0 ? "Publisher misconfiguration: ".concat(strValueOf2) : new String("Publisher misconfiguration: "));
            default:
                throw new zzj(1, "Invalid response from server.");
        }
        String str2 = i66Var.a;
        o36 o36Var = str2 == null ? null : new o36(i66Var.b, str2);
        e61 e61Var = (e61) this.y;
        ((gy5) e61Var.c).b.edit().putStringSet("stored_info", new HashSet(i66Var.d)).apply();
        for (g66 g66Var : i66Var.e) {
            int i3 = g66Var.b;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                str = null;
            } else if (i4 == 1) {
                str = "write";
            } else if (i4 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                mw6 mw6Var = (mw6) e61Var.a;
                final String str3 = g66Var.a;
                final rx5[] rx5VarArr = {(rx5) e61Var.b};
                mw6Var.getClass();
                mw6Var.a.execute(new Runnable() { // from class: cg6
                    @Override // java.lang.Runnable
                    public final void run() {
                        final JSONObject jSONObject;
                        String str4 = str;
                        if (TextUtils.isEmpty(str4)) {
                            Log.d("UserMessagingPlatform", "Error on action: empty action name");
                            return;
                        }
                        final String lowerCase = str4.toLowerCase();
                        String str5 = str3;
                        if (TextUtils.isEmpty(str5)) {
                            jSONObject = new JSONObject();
                        } else {
                            try {
                                jSONObject = new JSONObject(str5);
                            } catch (JSONException unused) {
                                StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str5).length());
                                sb.append("Action[");
                                sb.append(lowerCase);
                                sb.append("]: failed to parse args: ");
                                sb.append(str5);
                                Log.d("UserMessagingPlatform", sb.toString());
                                return;
                            }
                        }
                        String strValueOf3 = String.valueOf(jSONObject);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 10 + strValueOf3.length());
                        sb2.append("Action[");
                        sb2.append(lowerCase);
                        sb2.append("]: ");
                        sb2.append(strValueOf3);
                        Log.d("UserMessagingPlatform", sb2.toString());
                        for (final rx5 rx5Var : rx5VarArr) {
                            FutureTask futureTask = new FutureTask(new Callable() { // from class: ij6
                                /* JADX WARN: Code duplicated, block: B:13:0x002c  */
                                /* JADX WARN: Code duplicated, block: B:81:0x01ca  */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    byte b;
                                    boolean z;
                                    rx5 rx5Var2 = rx5Var;
                                    rx5Var2.getClass();
                                    String str6 = lowerCase;
                                    int iHashCode = str6.hashCode();
                                    boolean z2 = true;
                                    if (iHashCode != 94746189) {
                                        if (iHashCode == 113399775 && str6.equals("write")) {
                                            b = 0;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (str6.equals("clear")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    JSONObject jSONObject2 = jSONObject;
                                    if (b == 0) {
                                        Application application = (Application) rx5Var2.a;
                                        HashMap map = new HashMap();
                                        Iterator<String> itKeys = jSONObject2.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            Object objOpt = jSONObject2.opt(next);
                                            String strValueOf4 = String.valueOf(objOpt);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(next).length() + 23 + strValueOf4.length());
                                            sb3.append("Writing to storage: [");
                                            sb3.append(next);
                                            sb3.append("] ");
                                            sb3.append(strValueOf4);
                                            Log.d("UserMessagingPlatform", sb3.toString());
                                            o36 o36VarA = m76.a(application, next);
                                            if (o36VarA == null) {
                                                z = false;
                                            } else {
                                                String str7 = o36VarA.a;
                                                if (!map.containsKey(str7)) {
                                                    map.put(str7, application.getSharedPreferences(str7, 0).edit());
                                                }
                                                SharedPreferences.Editor editor = (SharedPreferences.Editor) map.get(str7);
                                                boolean z3 = objOpt instanceof Integer;
                                                String str8 = o36VarA.b;
                                                if (z3) {
                                                    editor.putInt(str8, ((Integer) objOpt).intValue());
                                                } else if (objOpt instanceof Long) {
                                                    editor.putLong(str8, ((Long) objOpt).longValue());
                                                } else if (objOpt instanceof Double) {
                                                    editor.putFloat(str8, ((Double) objOpt).floatValue());
                                                } else if (objOpt instanceof Float) {
                                                    editor.putFloat(str8, ((Float) objOpt).floatValue());
                                                } else if (objOpt instanceof Boolean) {
                                                    editor.putBoolean(str8, ((Boolean) objOpt).booleanValue());
                                                } else if (objOpt instanceof String) {
                                                    editor.putString(str8, (String) objOpt);
                                                } else {
                                                    z = false;
                                                }
                                                z = true;
                                            }
                                            if (z) {
                                                ((gy5) rx5Var2.b).c.add(next);
                                            } else {
                                                String strValueOf5 = String.valueOf(next);
                                                Log.d("UserMessagingPlatform", strValueOf5.length() != 0 ? "Failed writing key: ".concat(strValueOf5) : new String("Failed writing key: "));
                                            }
                                        }
                                        gy5 gy5Var = (gy5) rx5Var2.b;
                                        gy5Var.b.edit().putStringSet("written_values", gy5Var.c).apply();
                                        Iterator it = map.values().iterator();
                                        while (it.hasNext()) {
                                            ((SharedPreferences.Editor) it.next()).apply();
                                        }
                                    } else if (b != 1) {
                                        z2 = false;
                                    } else {
                                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
                                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                                            String strValueOf6 = String.valueOf(jSONObject2.toString());
                                            Log.d("UserMessagingPlatform", strValueOf6.length() != 0 ? "Action[clear]: wrong args.".concat(strValueOf6) : new String("Action[clear]: wrong args."));
                                        } else {
                                            HashSet<String> hashSet = new HashSet();
                                            int length = jSONArrayOptJSONArray.length();
                                            for (int i5 = 0; i5 < length; i5++) {
                                                String strOptString = jSONArrayOptJSONArray.optString(i5);
                                                if (TextUtils.isEmpty(strOptString)) {
                                                    StringBuilder sb4 = new StringBuilder(46);
                                                    sb4.append("Action[clear]: empty key at index: ");
                                                    sb4.append(i5);
                                                    Log.d("UserMessagingPlatform", sb4.toString());
                                                } else {
                                                    hashSet.add(strOptString);
                                                }
                                            }
                                            Application application2 = (Application) rx5Var2.a;
                                            HashMap map2 = new HashMap();
                                            for (String str9 : hashSet) {
                                                o36 o36VarA2 = m76.a(application2, str9);
                                                if (o36VarA2 == null) {
                                                    String strValueOf7 = String.valueOf(str9);
                                                    Log.d("UserMessagingPlatform", strValueOf7.length() != 0 ? "clearKeys: unable to process key: ".concat(strValueOf7) : new String("clearKeys: unable to process key: "));
                                                } else {
                                                    String str10 = o36VarA2.a;
                                                    if (!map2.containsKey(str10)) {
                                                        map2.put(str10, application2.getSharedPreferences(str10, 0).edit());
                                                    }
                                                    ((SharedPreferences.Editor) map2.get(str10)).remove(o36VarA2.b);
                                                }
                                            }
                                            Iterator it2 = map2.values().iterator();
                                            while (it2.hasNext()) {
                                                ((SharedPreferences.Editor) it2.next()).apply();
                                            }
                                        }
                                    }
                                    return Boolean.valueOf(z2);
                                }
                            });
                            ((Executor) rx5Var.c).execute(futureTask);
                            try {
                                if (((Boolean) futureTask.get()).booleanValue()) {
                                    return;
                                }
                            } catch (InterruptedException e) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 33);
                                sb3.append("Thread interrupted for Action[");
                                sb3.append(lowerCase);
                                sb3.append("]: ");
                                Log.d("UserMessagingPlatform", sb3.toString(), e);
                            } catch (ExecutionException e2) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + 24);
                                sb4.append("Failed to run Action[");
                                sb4.append(lowerCase);
                                sb4.append("]: ");
                                Log.d("UserMessagingPlatform", sb4.toString(), e2.getCause());
                            }
                        }
                    }
                });
            }
        }
        return new tp1(this.x, o36Var);
    }

    public final long c(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        Object obj;
        Object obj2;
        while (true) {
            long jZze = zzzgVar.zze();
            long jZzd = zzzgVar.zzd() - 6;
            obj = this.z;
            obj2 = this.y;
            if (jZze >= jZzd) {
                break;
            }
            zzzs zzzsVar = (zzzs) obj2;
            int i = this.x;
            zzzn zzznVar = (zzzn) obj;
            long jZze2 = zzzgVar.zze();
            byte[] bArr = new byte[2];
            zzyv zzyvVar = (zzyv) zzzgVar;
            zzyvVar.zzm(bArr, 0, 2, false);
            if (((bArr[1] & 255) | ((bArr[0] & 255) << 8)) != i) {
                zzzgVar.zzj();
                zzyvVar.zzl((int) (jZze2 - zzzgVar.zzf()), false);
            } else {
                zzed zzedVar = new zzed(16);
                System.arraycopy(bArr, 0, zzedVar.zzH(), 0, 2);
                zzedVar.zzE(zzzj.zza(zzzgVar, zzedVar.zzH(), 2, 14));
                zzzgVar.zzj();
                zzyvVar.zzl((int) (jZze2 - zzzgVar.zzf()), false);
                if (zzzo.zzc(zzedVar, zzzsVar, i, zzznVar)) {
                    break;
                }
            }
            zzyvVar.zzl(1, false);
        }
        if (zzzgVar.zze() < zzzgVar.zzd() - 6) {
            return ((zzzn) obj).zza;
        }
        ((zzyv) zzzgVar).zzl((int) (zzzgVar.zzd() - zzzgVar.zze()), false);
        return ((zzzs) obj2).zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final zzyp zza(zzzg zzzgVar, long j) throws EOFException, InterruptedIOException {
        int iZza;
        int iZza2;
        long j2;
        int i = this.w;
        Object obj = this.y;
        switch (i) {
            case 0:
                long jZzf = zzzgVar.zzf();
                long jC = c(zzzgVar);
                long jZze = zzzgVar.zze();
                ((zzyv) zzzgVar).zzl(Math.max(6, ((zzzs) obj).zzc), false);
                long jC2 = c(zzzgVar);
                long jZze2 = zzzgVar.zze();
                if (jC > j || jC2 <= j) {
                    return jC2 <= j ? zzyp.zzf(jC2, jZze2) : zzyp.zzd(jC, jZzf);
                }
                return zzyp.zze(jZze);
            default:
                long jZzf2 = zzzgVar.zzf();
                int iMin = (int) Math.min(112800L, zzzgVar.zzd() - jZzf2);
                zzed zzedVar = (zzed) this.z;
                zzedVar.zzC(iMin);
                ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, iMin, false);
                int iZzd = zzedVar.zzd();
                long j3 = -9223372036854775807L;
                long j4 = -1;
                long j5 = -9223372036854775807L;
                long j6 = -1;
                while (zzedVar.zza() >= 188 && (iZza2 = (iZza = zzain.zza(zzedVar.zzH(), zzedVar.zzc(), iZzd)) + 188) <= iZzd) {
                    long jZzb = zzain.zzb(zzedVar, iZza, this.x);
                    if (jZzb != j3) {
                        long jZzb2 = ((zzej) obj).zzb(jZzb);
                        if (jZzb2 > j) {
                            if (j5 == -9223372036854775807L) {
                                return zzyp.zzd(jZzb2, jZzf2);
                            }
                            j2 = jZzf2 + j6;
                        } else if (100000 + jZzb2 > j) {
                            j2 = jZzf2 + ((long) iZza);
                        } else {
                            j5 = jZzb2;
                            j6 = iZza;
                        }
                        return zzyp.zze(j2);
                    }
                    zzedVar.zzF(iZza2);
                    j4 = iZza2;
                    j3 = -9223372036854775807L;
                }
                return j5 != j3 ? zzyp.zzf(j5, jZzf2 + j4) : zzyp.zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final void zzb() {
        switch (this.w) {
            case 0:
                break;
            default:
                zzed zzedVar = (zzed) this.z;
                byte[] bArr = zzel.zzf;
                int length = bArr.length;
                zzedVar.zzD(bArr, 0);
                break;
        }
    }

    public /* synthetic */ ss5(zzzs zzzsVar, int i) {
        this.w = 0;
        this.y = zzzsVar;
        this.x = i;
        this.z = new zzzn();
    }

    public ss5(int i, zzej zzejVar) {
        this.w = 1;
        this.x = i;
        this.y = zzejVar;
        this.z = new zzed();
    }

    public ss5(nr4[] nr4VarArr) {
        this.w = 3;
        this.x = 1024;
        this.y = nr4VarArr;
        this.z = new kg2();
    }
}
