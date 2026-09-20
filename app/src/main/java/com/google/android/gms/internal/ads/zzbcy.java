package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import defpackage.cq4;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbcy {
    public final zzbcw a;
    public final int b;
    public final int c;

    public zzbcy(int i, int i2, int i3) {
        this.b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.c = 1;
        } else {
            this.c = i3;
        }
        this.a = new zzbcw(i2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        Collections.sort(arrayList2, new zzbcx(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzbcm) arrayList2.get(i2)).e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i3 = 1;
                        boolean z = false;
                        while (true) {
                            int i4 = i3 + 2;
                            if (i4 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i3) == '\'') {
                                if (sb.charAt(i3 - 1) != ' ') {
                                    int i5 = i3 + 1;
                                    if ((sb.charAt(i5) == 's' || sb.charAt(i5) == 'S') && (i4 == sb.length() || sb.charAt(i4) == ' ')) {
                                        sb.insert(i3, ' ');
                                        i3 = i4;
                                    } else {
                                        sb.setCharAt(i3, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i3, ' ');
                                }
                                z = true;
                            }
                            i3++;
                        }
                        String string = z ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzbcr.zzb(str, true);
                    int length = strArrZzb.length;
                    int i6 = this.c;
                    if (length >= i6) {
                        int i7 = 0;
                        while (true) {
                            int length2 = strArrZzb.length;
                            i = this.b;
                            if (i7 >= length2) {
                                break;
                            }
                            String strConcat = "";
                            for (int i8 = 0; i8 < i6; i8++) {
                                int i9 = i7 + i8;
                                if (i9 >= strArrZzb.length) {
                                    break;
                                }
                                if (i8 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrZzb[i9]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i) {
                                break loop0;
                            }
                            i7++;
                        }
                        if (hashSet.size() >= i) {
                            break loop0;
                        }
                    }
                }
            }
        }
        cq4 cq4Var = new cq4(16);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) cq4Var.y).write(this.a.zzb((String) it.next()));
            } catch (IOException e) {
                zzcgn.zzh("Error while writing hash to byteStream", e);
            }
        }
        return cq4Var.toString();
    }
}
