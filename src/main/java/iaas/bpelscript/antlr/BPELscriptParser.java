// $ANTLR 3.1.2 /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g 2009-03-01 14:12:48

/*
 * Copyright 2008-2009 Marc Bischof 
 * based on simpel.g by Matthieu Riou
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *     http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package iaas.bpelscript.antlr;

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BPELscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PROCESS", "PICK", "SEQUENCE", "FLOW", "FLOWS", "IF", "ELSIF", "ELSE", "WHILE", "UNTIL", "FOR", "INVOKE", "PROC_STMTS", "RECEIVE", "REPLY", "ASSIGN", "THROW", "WAIT", "EXIT", "TIMEOUT", "TRY", "CATCH", "CATCH_ALL", "SCOPE", "EVENT", "ALARM", "ONMESSAGE", "COMPENSATION", "COMPENSATE", "CORRELATION", "CORR_MAP", "PARTNERLINK", "VARIABLE", "VALIDATE", "BLOCK_PARAM", "SIGNAL", "JOIN", "WITH", "MAP", "NOP", "RETHROW", "OPAQUE", "EXPR", "EXT_EXPR", "XML_LITERAL", "CALL", "NAMESPACE", "NS", "PATH", "EXTENSION", "EXTENSIONACT", "IMPORT", "MESSAGES", "CORRSETS", "CORRSET", "XML", "JS", "FINAL", "BRANCH", "PID", "VARIABLES", "PARTNERLINKS", "PORTTYPE", "STD_ATTR", "ONALARM", "REPEATEVERY", "EVENTHDL", "MESSAGE", "TERMINATION", "MSGEX", "FAULTNAME", "MSGTYPE", "VITYPE", "VIELT", "FAULTELT", "EXPRLG", "QUERYLG", "SJF", "EOSF", "SEMI", "ID", "CREATE_INST", "STRING", "OPAQUE_EXPR", "PARALLEL", "SBO", "ISOLATED", "KEY", "VALID", "KEEPSRC", "IGNORE", "PROP", "EXT_ACT", "MUSTUND", "INITPARTNER", "INIT_COR", "PATTERN_COR", "INT", "LETTER", "DIGIT", "ESCAPE_SEQ", "CR", "SL_COMMENTS", "WS", "'process'", "'{'", "'}'", "'|'", "','", "'@name'", "'pick'", "'onMessage'", "'('", "')'", "'alarm'", "'timeout'", "'repeatEvery'", "'parallel'", "'and'", "'signal'", "'@signal'", "'@join'", "'join'", "'if'", "'elseif'", "'else'", "'while'", "'repeat'", "'until'", "'for'", "'='", "'to'", "'finish'", "'try'", "'@faultMessageType'", "'catch'", "'catchAll'", "'scope'", "'onTermination'", "'events'", "'event'", "'compensation'", "'with'", "':'", "'receive'", "'reply'", "'invoke'", "'@faultVariable'", "'@faultVar'", "'throw'", "'rethrow'", "'compensate'", "'exit'", "'validate'", "'nop'", "'opaque()'", "'namespace'", "'extension'", "'import'", "'::'", "'messages'", "'var'", "'partnerLink'", "'partnerlink'", "'correlates'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'.'", "'@portType'", "'@pt'", "'@messageExchange'", "'@mex'", "'@messageType'", "'@msgType'", "'@type'", "'@element'", "'@faultName'", "'@fault'", "'@faultElement'", "'@expressionLanguage'", "'@exprLg'", "'@queryLanguage'", "'@queryLg'"
    };
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int LETTER=103;
    public static final int NOP=44;
    public static final int T__160=160;
    public static final int PARTNERLINKS=66;
    public static final int T__167=167;
    public static final int T__168=168;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int EVENTHDL=71;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int FINAL=62;
    public static final int IMPORT=56;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int FLOWS=9;
    public static final int VALID=93;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int TIMEOUT=24;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int PID=64;
    public static final int RETHROW=45;
    public static final int KEY=92;
    public static final int MESSAGES=57;
    public static final int ELSE=12;
    public static final int INT=102;
    public static final int WAIT=22;
    public static final int SJF=82;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int CREATE_INST=86;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int WS=108;
    public static final int T__129=129;
    public static final int SBO=90;
    public static final int CALL=50;
    public static final int EOSF=83;
    public static final int ELSIF=11;
    public static final int INVOKE=16;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int XML=60;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int COMPENSATE=33;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int ONALARM=69;
    public static final int EXT_EXPR=48;
    public static final int T__109=109;
    public static final int SIGNAL=40;
    public static final int T__111=111;
    public static final int STD_ATTR=68;
    public static final int QUERYLG=81;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int MESSAGE=72;
    public static final int T__112=112;
    public static final int BLOCK_PARAM=39;
    public static final int EXPRLG=80;
    public static final int ISOLATED=91;
    public static final int PARTNERLINK=36;
    public static final int IGNORE=95;
    public static final int MSGTYPE=76;
    public static final int FAULTELT=79;
    public static final int SEMI=84;
    public static final int VALIDATE=38;
    public static final int TERMINATION=73;
    public static final int BRANCH=63;
    public static final int CORRSETS=58;
    public static final int INITPARTNER=99;
    public static final int PROC_STMTS=17;
    public static final int PROCESS=5;
    public static final int CR=106;
    public static final int RECEIVE=18;
    public static final int EXTENSION=54;
    public static final int STRING=87;
    public static final int MSGEX=74;
    public static final int WHILE=13;
    public static final int OPAQUE=46;
    public static final int FAULTNAME=75;
    public static final int REPEATEVERY=70;
    public static final int INIT_COR=100;
    public static final int CATCH_ALL=27;
    public static final int PICK=6;
    public static final int PATH=53;
    public static final int EXTENSIONACT=55;
    public static final int ONMESSAGE=31;
    public static final int EXIT=23;
    public static final int NS=52;
    public static final int CORRELATION=34;
    public static final int PORTTYPE=67;
    public static final int CORR_MAP=35;
    public static final int VIELT=78;
    public static final int TRY=25;
    public static final int NAMESPACE=51;
    public static final int SEQUENCE=7;
    public static final int VITYPE=77;
    public static final int SL_COMMENTS=107;
    public static final int PATTERN_COR=101;
    public static final int VARIABLE=37;
    public static final int FLOW=8;
    public static final int UNTIL=14;
    public static final int CORRSET=59;
    public static final int REPLY=19;
    public static final int EXT_ACT=97;
    public static final int CATCH=26;
    public static final int THROW=21;
    public static final int KEEPSRC=94;
    public static final int PARALLEL=89;
    public static final int FOR=15;
    public static final int ALARM=30;
    public static final int ID=85;
    public static final int PROP=96;
    public static final int IF=10;
    public static final int EXPR=47;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int SCOPE=28;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int DIGIT=104;
    public static final int WITH=42;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int MUSTUND=98;
    public static final int T__189=189;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int JS=61;
    public static final int EVENT=29;
    public static final int ROOT=4;
    public static final int JOIN=41;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int COMPENSATION=32;
    public static final int OPAQUE_EXPR=88;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int ESCAPE_SEQ=105;
    public static final int MAP=43;
    public static final int ASSIGN=20;
    public static final int VARIABLES=65;
    public static final int XML_LITERAL=49;
    public static final int T__169=169;

    // delegates
    // delegators


        public BPELscriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BPELscriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BPELscriptParser.tokenNames; }
    public String getGrammarFileName() { return "/home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g"; }


    /**
     * Shortcut with default name "Option"
     * reports a failed predicate exception to system.err.println
     */
    public void reportFailedPredicateWarning(FailedPredicateException exc) {
        reportFailedPredicateWarning(exc, "Option");
    }

    /**
     * reports a failed predicate exception to system.err.println
     */
    public void reportFailedPredicateWarning(FailedPredicateException exc, String name) {
        System.err.println("Warning: Duplicate "+name+" definition on line "+exc.line);
    }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:1: program : ( declaration )+ -> ^( ROOT ( declaration )+ ) ;
    public final BPELscriptParser.program_return program() throws RecognitionException {
        BPELscriptParser.program_return retval = new BPELscriptParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.declaration_return declaration1 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:9: ( ( declaration )+ -> ^( ROOT ( declaration )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:11: ( declaration )+
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:11: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=SJF && LA1_0<=EOSF)||LA1_0==MUSTUND||LA1_0==109||(LA1_0>=161 && LA1_0<=162)||LA1_0==187||(LA1_0>=192 && LA1_0<=195)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:11: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program328);
            	    declaration1=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:24: -> ^( ROOT ( declaration )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:97:27: ^( ROOT ( declaration )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROOT, "ROOT"), root_1);

                if ( !(stream_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:1: declaration : ( process | sub_declaration );
    public final BPELscriptParser.declaration_return declaration() throws RecognitionException {
        BPELscriptParser.declaration_return retval = new BPELscriptParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.process_return process2 = null;

        BPELscriptParser.sub_declaration_return sub_declaration3 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:13: ( process | sub_declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=SJF && LA2_0<=EOSF)||LA2_0==109||(LA2_0>=192 && LA2_0<=195)) ) {
                alt2=1;
            }
            else if ( (LA2_0==MUSTUND||(LA2_0>=161 && LA2_0<=162)||LA2_0==187) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:15: process
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_process_in_declaration347);
                    process2=process();

                    state._fsp--;

                    adaptor.addChild(root_0, process2.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:99:25: sub_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sub_declaration_in_declaration351);
                    sub_declaration3=sub_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, sub_declaration3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class sub_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sub_declaration"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:101:1: sub_declaration : ( namespace | extension | imports );
    public final BPELscriptParser.sub_declaration_return sub_declaration() throws RecognitionException {
        BPELscriptParser.sub_declaration_return retval = new BPELscriptParser.sub_declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.namespace_return namespace4 = null;

        BPELscriptParser.extension_return extension5 = null;

        BPELscriptParser.imports_return imports6 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:3: ( namespace | extension | imports )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 161:
                {
                alt3=1;
                }
                break;
            case MUSTUND:
            case 162:
                {
                alt3=2;
                }
                break;
            case 187:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:5: namespace
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_sub_declaration361);
                    namespace4=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace4.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:17: extension
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_extension_in_sub_declaration365);
                    extension5=extension();

                    state._fsp--;

                    adaptor.addChild(root_0, extension5.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:102:29: imports
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_imports_in_sub_declaration369);
                    imports6=imports();

                    state._fsp--;

                    adaptor.addChild(root_0, imports6.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sub_declaration"

    public static class process_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "process"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:105:1: process : ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )* 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) ;
    public final BPELscriptParser.process_return process() throws RecognitionException {
        BPELscriptParser.process_return retval = new BPELscriptParser.process_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token sjf=null;
        Token exitOnStandardFault=null;
        Token string_literal7=null;
        List list_j=null;
        List list_s=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.ns_id_return ns_id8 = null;

        BPELscriptParser.std_attr_return std_attr9 = null;

        BPELscriptParser.block_return block10 = null;

        BPELscriptParser.eventHdl_return eventHdl11 = null;

        BPELscriptParser.ajoin_return j = null;
         j = null;
        BPELscriptParser.asignal_return s = null;
         s = null;
        CommonTree sjf_tree=null;
        CommonTree exitOnStandardFault_tree=null;
        CommonTree string_literal7_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:106:2: ( ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )* 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )? -> ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:4: ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )* 'process' ns_id std_attr (j+= ajoin )? (s+= asignal )* block ( eventHdl )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:4: ({...}?q= queryLg | {...}?e= exprLg | {...}?sjf= SJF | {...}?exitOnStandardFault= EOSF )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 194:
                case 195:
                    {
                    alt4=1;
                    }
                    break;
                case 192:
                case 193:
                    {
                    alt4=2;
                    }
                    break;
                case SJF:
                    {
                    alt4=3;
                    }
                    break;
                case EOSF:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:6: {...}?q= queryLg
            	    {
            	    if ( !((q==null)) ) {
            	        throw new FailedPredicateException(input, "process", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_process389);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:30: {...}?e= exprLg
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "process", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_process398);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:53: {...}?sjf= SJF
            	    {
            	    if ( !((sjf==null)) ) {
            	        throw new FailedPredicateException(input, "process", "sjf==null");
            	    }
            	    sjf=(Token)match(input,SJF,FOLLOW_SJF_in_process407);  
            	    stream_SJF.add(sjf);


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:107:77: {...}?exitOnStandardFault= EOSF
            	    {
            	    if ( !((exitOnStandardFault==null)) ) {
            	        throw new FailedPredicateException(input, "process", "exitOnStandardFault==null");
            	    }
            	    exitOnStandardFault=(Token)match(input,EOSF,FOLLOW_EOSF_in_process416);  
            	    stream_EOSF.add(exitOnStandardFault);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            string_literal7=(Token)match(input,109,FOLLOW_109_in_process424);  
            stream_109.add(string_literal7);

            pushFollow(FOLLOW_ns_id_in_process426);
            ns_id8=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id8.getTree());
            pushFollow(FOLLOW_std_attr_in_process428);
            std_attr9=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr9.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:4: (j+= ajoin )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==126) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_process434);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTree());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: (s+= asignal )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==125) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:109:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_process439);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTree());


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_process445);
            block10=block();

            state._fsp--;

            stream_block.add(block10.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:110:9: ( eventHdl )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==144) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:110:9: eventHdl
                    {
                    pushFollow(FOLLOW_eventHdl_in_process447);
                    eventHdl11=eventHdl();

                    state._fsp--;

                    stream_eventHdl.add(eventHdl11.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: asignal, exitOnStandardFault, eventHdl, exprLg, sjf, queryLg, block, ajoin, std_attr, ns_id
            // token labels: exitOnStandardFault, sjf
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_exitOnStandardFault=new RewriteRuleTokenStream(adaptor,"token exitOnStandardFault",exitOnStandardFault);
            RewriteRuleTokenStream stream_sjf=new RewriteRuleTokenStream(adaptor,"token sjf",sjf);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 111:2: -> ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:5: ^( PROCESS ns_id block ( eventHdl )? ( queryLg )? ( exprLg )? ( $sjf)? ( $exitOnStandardFault)? std_attr ( ajoin )? ( asignal )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCESS, "PROCESS"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:27: ( eventHdl )?
                if ( stream_eventHdl.hasNext() ) {
                    adaptor.addChild(root_1, stream_eventHdl.nextTree());

                }
                stream_eventHdl.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:37: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:46: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:54: ( $sjf)?
                if ( stream_sjf.hasNext() ) {
                    adaptor.addChild(root_1, stream_sjf.nextNode());

                }
                stream_sjf.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:60: ( $exitOnStandardFault)?
                if ( stream_exitOnStandardFault.hasNext() ) {
                    adaptor.addChild(root_1, stream_exitOnStandardFault.nextNode());

                }
                stream_exitOnStandardFault.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:91: ( ajoin )?
                if ( stream_ajoin.hasNext() ) {
                    adaptor.addChild(root_1, stream_ajoin.nextTree());

                }
                stream_ajoin.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:111:98: ( asignal )*
                while ( stream_asignal.hasNext() ) {
                    adaptor.addChild(root_1, stream_asignal.nextTree());

                }
                stream_asignal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "process"

    public static class proc_stmts_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "proc_stmts"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:114:1: proc_stmts : ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) ;
    public final BPELscriptParser.proc_stmts_return proc_stmts() throws RecognitionException {
        BPELscriptParser.proc_stmts_return retval = new BPELscriptParser.proc_stmts_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI13=null;
        Token SEMI15=null;
        List list_s=null;
        BPELscriptParser.join_return join12 = null;

        BPELscriptParser.proc_stmt_return proc_stmt14 = null;

        BPELscriptParser.signal_return s = null;
         s = null;
        CommonTree SEMI13_tree=null;
        CommonTree SEMI15_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_proc_stmt=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmt");
        RewriteRuleSubtreeStream stream_signal=new RewriteRuleSubtreeStream(adaptor,"rule signal");
        RewriteRuleSubtreeStream stream_join=new RewriteRuleSubtreeStream(adaptor,"rule join");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:2: ( ( join SEMI )? proc_stmt (s+= signal SEMI )* -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:4: ( join SEMI )? proc_stmt (s+= signal SEMI )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:4: ( join SEMI )?
            int alt8=2;
            switch ( input.LA(1) ) {
                case 194:
                    {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==STRING) ) {
                        int LA8_7 = input.LA(3);

                        if ( (LA8_7==127) ) {
                            alt8=1;
                        }
                    }
                    }
                    break;
                case 195:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==STRING) ) {
                        int LA8_7 = input.LA(3);

                        if ( (LA8_7==127) ) {
                            alt8=1;
                        }
                    }
                    }
                    break;
                case 127:
                    {
                    alt8=1;
                    }
                    break;
                case 192:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (LA8_4==STRING) ) {
                        int LA8_8 = input.LA(3);

                        if ( (LA8_8==127) ) {
                            alt8=1;
                        }
                    }
                    }
                    break;
                case 193:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (LA8_5==STRING) ) {
                        int LA8_8 = input.LA(3);

                        if ( (LA8_8==127) ) {
                            alt8=1;
                        }
                    }
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:5: join SEMI
                    {
                    pushFollow(FOLLOW_join_in_proc_stmts502);
                    join12=join();

                    state._fsp--;

                    stream_join.add(join12.getTree());
                    SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts504);  
                    stream_SEMI.add(SEMI13);


                    }
                    break;

            }

            pushFollow(FOLLOW_proc_stmt_in_proc_stmts508);
            proc_stmt14=proc_stmt();

            state._fsp--;

            stream_proc_stmt.add(proc_stmt14.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:27: (s+= signal SEMI )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 194:
                    {
                    alt9=1;
                    }
                    break;
                case 195:
                    {
                    alt9=1;
                    }
                    break;
                case 192:
                    {
                    alt9=1;
                    }
                    break;
                case 193:
                    {
                    alt9=1;
                    }
                    break;
                case 124:
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:115:28: s+= signal SEMI
            	    {
            	    pushFollow(FOLLOW_signal_in_proc_stmts513);
            	    s=signal();

            	    state._fsp--;

            	    stream_signal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTree());

            	    SEMI15=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmts515);  
            	    stream_SEMI.add(SEMI15);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: proc_stmt, signal, join
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:2: -> ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:116:6: ^( PROC_STMTS ( join )? ( signal )* proc_stmt )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC_STMTS, "PROC_STMTS"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:116:19: ( join )?
                if ( stream_join.hasNext() ) {
                    adaptor.addChild(root_1, stream_join.nextTree());

                }
                stream_join.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:116:25: ( signal )*
                while ( stream_signal.hasNext() ) {
                    adaptor.addChild(root_1, stream_signal.nextTree());

                }
                stream_signal.reset();
                adaptor.addChild(root_1, stream_proc_stmt.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proc_stmts"

    public static class proc_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "proc_stmt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:118:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) );
    public final BPELscriptParser.proc_stmt_return proc_stmt() throws RecognitionException {
        BPELscriptParser.proc_stmt_return retval = new BPELscriptParser.proc_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMI42=null;
        BPELscriptParser.if_ex_return if_ex16 = null;

        BPELscriptParser.flow_return flow17 = null;

        BPELscriptParser.pick_return pick18 = null;

        BPELscriptParser.while_ex_return while_ex19 = null;

        BPELscriptParser.until_ex_return until_ex20 = null;

        BPELscriptParser.foreach_return foreach21 = null;

        BPELscriptParser.scope_ex_return scope_ex22 = null;

        BPELscriptParser.ext_act_return ext_act23 = null;

        BPELscriptParser.try_ex_return try_ex24 = null;

        BPELscriptParser.corr_sets_return corr_sets25 = null;

        BPELscriptParser.invoke_return invoke26 = null;

        BPELscriptParser.receive_return receive27 = null;

        BPELscriptParser.reply_return reply28 = null;

        BPELscriptParser.assign_return assign29 = null;

        BPELscriptParser.throw_ex_return throw_ex30 = null;

        BPELscriptParser.rethrow_ex_return rethrow_ex31 = null;

        BPELscriptParser.alarm_return alarm32 = null;

        BPELscriptParser.timeout_return timeout33 = null;

        BPELscriptParser.exit_return exit34 = null;

        BPELscriptParser.variables_return variables35 = null;

        BPELscriptParser.validate_return validate36 = null;

        BPELscriptParser.partner_links_return partner_links37 = null;

        BPELscriptParser.compensate_return compensate38 = null;

        BPELscriptParser.nop_return nop39 = null;

        BPELscriptParser.messages_return messages40 = null;

        BPELscriptParser.opaque_return opaque41 = null;


        CommonTree SEMI42_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:119:2: ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) )
            int alt11=11;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:3: if_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_ex_in_proc_stmt546);
                    if_ex16=if_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, if_ex16.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:11: flow
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_flow_in_proc_stmt550);
                    flow17=flow();

                    state._fsp--;

                    adaptor.addChild(root_0, flow17.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:18: pick
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pick_in_proc_stmt554);
                    pick18=pick();

                    state._fsp--;

                    adaptor.addChild(root_0, pick18.getTree());

                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:25: while_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_ex_in_proc_stmt558);
                    while_ex19=while_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, while_ex19.getTree());

                    }
                    break;
                case 5 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:36: until_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_until_ex_in_proc_stmt562);
                    until_ex20=until_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, until_ex20.getTree());

                    }
                    break;
                case 6 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:47: foreach
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_foreach_in_proc_stmt566);
                    foreach21=foreach();

                    state._fsp--;

                    adaptor.addChild(root_0, foreach21.getTree());

                    }
                    break;
                case 7 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:57: scope_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_scope_ex_in_proc_stmt570);
                    scope_ex22=scope_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, scope_ex22.getTree());

                    }
                    break;
                case 8 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:120:68: ext_act
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ext_act_in_proc_stmt574);
                    ext_act23=ext_act();

                    state._fsp--;

                    adaptor.addChild(root_0, ext_act23.getTree());

                    }
                    break;
                case 9 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:121:5: try_ex
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_ex_in_proc_stmt581);
                    try_ex24=try_ex();

                    state._fsp--;

                    adaptor.addChild(root_0, try_ex24.getTree());

                    }
                    break;
                case 10 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:121:14: corr_sets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_corr_sets_in_proc_stmt585);
                    corr_sets25=corr_sets();

                    state._fsp--;

                    adaptor.addChild(root_0, corr_sets25.getTree());

                    }
                    break;
                case 11 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:5: ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI )
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque )
                    int alt10=16;
                    alt10 = dfa10.predict(input);
                    switch (alt10) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:7: invoke
                            {
                            pushFollow(FOLLOW_invoke_in_proc_stmt596);
                            invoke26=invoke();

                            state._fsp--;

                            adaptor.addChild(root_0, invoke26.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:16: receive
                            {
                            pushFollow(FOLLOW_receive_in_proc_stmt600);
                            receive27=receive();

                            state._fsp--;

                            adaptor.addChild(root_0, receive27.getTree());

                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:26: reply
                            {
                            pushFollow(FOLLOW_reply_in_proc_stmt604);
                            reply28=reply();

                            state._fsp--;

                            adaptor.addChild(root_0, reply28.getTree());

                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:34: assign
                            {
                            pushFollow(FOLLOW_assign_in_proc_stmt608);
                            assign29=assign();

                            state._fsp--;

                            adaptor.addChild(root_0, assign29.getTree());

                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:43: throw_ex
                            {
                            pushFollow(FOLLOW_throw_ex_in_proc_stmt612);
                            throw_ex30=throw_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, throw_ex30.getTree());

                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:54: rethrow_ex
                            {
                            pushFollow(FOLLOW_rethrow_ex_in_proc_stmt616);
                            rethrow_ex31=rethrow_ex();

                            state._fsp--;

                            adaptor.addChild(root_0, rethrow_ex31.getTree());

                            }
                            break;
                        case 7 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:67: alarm
                            {
                            pushFollow(FOLLOW_alarm_in_proc_stmt620);
                            alarm32=alarm();

                            state._fsp--;

                            adaptor.addChild(root_0, alarm32.getTree());

                            }
                            break;
                        case 8 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:75: timeout
                            {
                            pushFollow(FOLLOW_timeout_in_proc_stmt624);
                            timeout33=timeout();

                            state._fsp--;

                            adaptor.addChild(root_0, timeout33.getTree());

                            }
                            break;
                        case 9 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:123:85: exit
                            {
                            pushFollow(FOLLOW_exit_in_proc_stmt628);
                            exit34=exit();

                            state._fsp--;

                            adaptor.addChild(root_0, exit34.getTree());

                            }
                            break;
                        case 10 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:5: variables
                            {
                            pushFollow(FOLLOW_variables_in_proc_stmt634);
                            variables35=variables();

                            state._fsp--;

                            adaptor.addChild(root_0, variables35.getTree());

                            }
                            break;
                        case 11 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:17: validate
                            {
                            pushFollow(FOLLOW_validate_in_proc_stmt638);
                            validate36=validate();

                            state._fsp--;

                            adaptor.addChild(root_0, validate36.getTree());

                            }
                            break;
                        case 12 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:28: partner_links
                            {
                            pushFollow(FOLLOW_partner_links_in_proc_stmt642);
                            partner_links37=partner_links();

                            state._fsp--;

                            adaptor.addChild(root_0, partner_links37.getTree());

                            }
                            break;
                        case 13 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:44: compensate
                            {
                            pushFollow(FOLLOW_compensate_in_proc_stmt646);
                            compensate38=compensate();

                            state._fsp--;

                            adaptor.addChild(root_0, compensate38.getTree());

                            }
                            break;
                        case 14 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:57: nop
                            {
                            pushFollow(FOLLOW_nop_in_proc_stmt650);
                            nop39=nop();

                            state._fsp--;

                            adaptor.addChild(root_0, nop39.getTree());

                            }
                            break;
                        case 15 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:63: messages
                            {
                            pushFollow(FOLLOW_messages_in_proc_stmt654);
                            messages40=messages();

                            state._fsp--;

                            adaptor.addChild(root_0, messages40.getTree());

                            }
                            break;
                        case 16 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:124:74: opaque
                            {
                            pushFollow(FOLLOW_opaque_in_proc_stmt658);
                            opaque41=opaque();

                            state._fsp--;

                            adaptor.addChild(root_0, opaque41.getTree());

                            }
                            break;

                    }

                    SEMI42=(Token)match(input,SEMI,FOLLOW_SEMI_in_proc_stmt661); 

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "proc_stmt"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:1: block : '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) ;
    public final BPELscriptParser.block_return block() throws RecognitionException {
        BPELscriptParser.block_return retval = new BPELscriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal43=null;
        Token char_literal45=null;
        BPELscriptParser.proc_stmts_return proc_stmts44 = null;


        CommonTree char_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:8: ( '{' ( proc_stmts )+ '}' -> ^( SEQUENCE ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:10: '{' ( proc_stmts )+ '}'
            {
            char_literal43=(Token)match(input,110,FOLLOW_110_in_block672);  
            stream_110.add(char_literal43);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:14: ( proc_stmts )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=SJF && LA12_0<=EOSF)||(LA12_0>=ID && LA12_0<=CREATE_INST)||(LA12_0>=OPAQUE_EXPR && LA12_0<=ISOLATED)||(LA12_0>=VALID && LA12_0<=IGNORE)||LA12_0==EXT_ACT||(LA12_0>=114 && LA12_0<=115)||(LA12_0>=119 && LA12_0<=120)||LA12_0==122||(LA12_0>=127 && LA12_0<=128)||(LA12_0>=131 && LA12_0<=132)||LA12_0==134||LA12_0==138||LA12_0==142||(LA12_0>=149 && LA12_0<=160)||(LA12_0>=165 && LA12_0<=169)||(LA12_0>=181 && LA12_0<=184)||(LA12_0>=189 && LA12_0<=190)||(LA12_0>=192 && LA12_0<=195)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:14: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_block674);
            	    proc_stmts44=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts44.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            char_literal45=(Token)match(input,111,FOLLOW_111_in_block677);  
            stream_111.add(char_literal45);



            // AST REWRITE
            // elements: proc_stmts
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 126:30: -> ^( SEQUENCE ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:126:33: ^( SEQUENCE ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                if ( !(stream_proc_stmts.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_proc_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_proc_stmts.nextTree());

                }
                stream_proc_stmts.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class scope_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_block"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:1: scope_block : '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) ;
    public final BPELscriptParser.scope_block_return scope_block() throws RecognitionException {
        BPELscriptParser.scope_block_return retval = new BPELscriptParser.scope_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal46=null;
        Token char_literal49=null;
        BPELscriptParser.sub_declaration_return sub_declaration47 = null;

        BPELscriptParser.proc_stmts_return proc_stmts48 = null;


        CommonTree char_literal46_tree=null;
        CommonTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_sub_declaration=new RewriteRuleSubtreeStream(adaptor,"rule sub_declaration");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:13: ( '{' ( sub_declaration )* ( proc_stmts )+ '}' -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:15: '{' ( sub_declaration )* ( proc_stmts )+ '}'
            {
            char_literal46=(Token)match(input,110,FOLLOW_110_in_scope_block695);  
            stream_110.add(char_literal46);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:19: ( sub_declaration )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==MUSTUND||(LA13_0>=161 && LA13_0<=162)||LA13_0==187) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:19: sub_declaration
            	    {
            	    pushFollow(FOLLOW_sub_declaration_in_scope_block697);
            	    sub_declaration47=sub_declaration();

            	    state._fsp--;

            	    stream_sub_declaration.add(sub_declaration47.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:36: ( proc_stmts )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=SJF && LA14_0<=EOSF)||(LA14_0>=ID && LA14_0<=CREATE_INST)||(LA14_0>=OPAQUE_EXPR && LA14_0<=ISOLATED)||(LA14_0>=VALID && LA14_0<=IGNORE)||LA14_0==EXT_ACT||(LA14_0>=114 && LA14_0<=115)||(LA14_0>=119 && LA14_0<=120)||LA14_0==122||(LA14_0>=127 && LA14_0<=128)||(LA14_0>=131 && LA14_0<=132)||LA14_0==134||LA14_0==138||LA14_0==142||(LA14_0>=149 && LA14_0<=160)||(LA14_0>=165 && LA14_0<=169)||(LA14_0>=181 && LA14_0<=184)||(LA14_0>=189 && LA14_0<=190)||(LA14_0>=192 && LA14_0<=195)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:36: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_scope_block700);
            	    proc_stmts48=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts48.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            char_literal49=(Token)match(input,111,FOLLOW_111_in_scope_block703);  
            stream_111.add(char_literal49);



            // AST REWRITE
            // elements: proc_stmts, sub_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 128:52: -> ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:55: ^( SEQUENCE ( sub_declaration )* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:128:66: ( sub_declaration )*
                while ( stream_sub_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_sub_declaration.nextTree());

                }
                stream_sub_declaration.reset();
                if ( !(stream_proc_stmts.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_proc_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_proc_stmts.nextTree());

                }
                stream_proc_stmts.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_block"

    public static class param_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param_block"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:1: param_block : '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) ;
    public final BPELscriptParser.param_block_return param_block() throws RecognitionException {
        BPELscriptParser.param_block_return retval = new BPELscriptParser.param_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token in=null;
        List list_in=null;
        BPELscriptParser.proc_stmts_return proc_stmts54 = null;


        CommonTree char_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree in_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_proc_stmts=new RewriteRuleSubtreeStream(adaptor,"rule proc_stmts");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:13: ( '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}' -> ^( SEQUENCE ( $in)* ( proc_stmts )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:15: '{' ( '|' in+= ID ( ',' in+= ID )* '|' )? ( proc_stmts )+ '}'
            {
            char_literal50=(Token)match(input,110,FOLLOW_110_in_param_block723);  
            stream_110.add(char_literal50);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:19: ( '|' in+= ID ( ',' in+= ID )* '|' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==112) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:20: '|' in+= ID ( ',' in+= ID )* '|'
                    {
                    char_literal51=(Token)match(input,112,FOLLOW_112_in_param_block726);  
                    stream_112.add(char_literal51);

                    in=(Token)match(input,ID,FOLLOW_ID_in_param_block730);  
                    stream_ID.add(in);

                    if (list_in==null) list_in=new ArrayList();
                    list_in.add(in);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:31: ( ',' in+= ID )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==113) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:32: ',' in+= ID
                    	    {
                    	    char_literal52=(Token)match(input,113,FOLLOW_113_in_param_block733);  
                    	    stream_113.add(char_literal52);

                    	    in=(Token)match(input,ID,FOLLOW_ID_in_param_block737);  
                    	    stream_ID.add(in);

                    	    if (list_in==null) list_in=new ArrayList();
                    	    list_in.add(in);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    char_literal53=(Token)match(input,112,FOLLOW_112_in_param_block741);  
                    stream_112.add(char_literal53);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:51: ( proc_stmts )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=SJF && LA17_0<=EOSF)||(LA17_0>=ID && LA17_0<=CREATE_INST)||(LA17_0>=OPAQUE_EXPR && LA17_0<=ISOLATED)||(LA17_0>=VALID && LA17_0<=IGNORE)||LA17_0==EXT_ACT||(LA17_0>=114 && LA17_0<=115)||(LA17_0>=119 && LA17_0<=120)||LA17_0==122||(LA17_0>=127 && LA17_0<=128)||(LA17_0>=131 && LA17_0<=132)||LA17_0==134||LA17_0==138||LA17_0==142||(LA17_0>=149 && LA17_0<=160)||(LA17_0>=165 && LA17_0<=169)||(LA17_0>=181 && LA17_0<=184)||(LA17_0>=189 && LA17_0<=190)||(LA17_0>=192 && LA17_0<=195)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:51: proc_stmts
            	    {
            	    pushFollow(FOLLOW_proc_stmts_in_param_block745);
            	    proc_stmts54=proc_stmts();

            	    state._fsp--;

            	    stream_proc_stmts.add(proc_stmts54.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            char_literal55=(Token)match(input,111,FOLLOW_111_in_param_block748);  
            stream_111.add(char_literal55);



            // AST REWRITE
            // elements: proc_stmts, in
            // token labels: 
            // rule labels: retval
            // token list labels: in
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_in=new RewriteRuleTokenStream(adaptor,"token in", list_in);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:67: -> ^( SEQUENCE ( $in)* ( proc_stmts )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:70: ^( SEQUENCE ( $in)* ( proc_stmts )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:130:81: ( $in)*
                while ( stream_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_in.nextNode());

                }
                stream_in.reset();
                if ( !(stream_proc_stmts.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_proc_stmts.hasNext() ) {
                    adaptor.addChild(root_1, stream_proc_stmts.nextTree());

                }
                stream_proc_stmts.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "param_block"

    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:1: body : ( block | proc_stmts );
    public final BPELscriptParser.body_return body() throws RecognitionException {
        BPELscriptParser.body_return retval = new BPELscriptParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.block_return block56 = null;

        BPELscriptParser.proc_stmts_return proc_stmts57 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:7: ( block | proc_stmts )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==110) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=SJF && LA18_0<=EOSF)||(LA18_0>=ID && LA18_0<=CREATE_INST)||(LA18_0>=OPAQUE_EXPR && LA18_0<=ISOLATED)||(LA18_0>=VALID && LA18_0<=IGNORE)||LA18_0==EXT_ACT||(LA18_0>=114 && LA18_0<=115)||(LA18_0>=119 && LA18_0<=120)||LA18_0==122||(LA18_0>=127 && LA18_0<=128)||(LA18_0>=131 && LA18_0<=132)||LA18_0==134||LA18_0==138||LA18_0==142||(LA18_0>=149 && LA18_0<=160)||(LA18_0>=165 && LA18_0<=169)||(LA18_0>=181 && LA18_0<=184)||(LA18_0>=189 && LA18_0<=190)||(LA18_0>=192 && LA18_0<=195)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:9: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_body770);
                    block56=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block56.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:132:17: proc_stmts
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_proc_stmts_in_body774);
                    proc_stmts57=proc_stmts();

                    state._fsp--;

                    adaptor.addChild(root_0, proc_stmts57.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class pick_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pick"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:1: pick : ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? ) ;
    public final BPELscriptParser.pick_return pick() throws RecognitionException {
        BPELscriptParser.pick_return retval = new BPELscriptParser.pick_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token c=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token char_literal60=null;
        Token char_literal63=null;
        BPELscriptParser.onMessage_return onMessage61 = null;

        BPELscriptParser.onAlarm_return onAlarm62 = null;


        CommonTree c_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree char_literal60_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        RewriteRuleSubtreeStream stream_onMessage=new RewriteRuleSubtreeStream(adaptor,"rule onMessage");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:6: ( ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'pick' '{' ( onMessage )+ ( onAlarm )* '}' -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:8: ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'pick' '{' ( onMessage )+ ( onAlarm )* '}'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:8: ({...}?c= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case CREATE_INST:
                    {
                    alt19=1;
                    }
                    break;
                case 114:
                    {
                    alt19=2;
                    }
                    break;
                case SJF:
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:135:10: {...}?c= CREATE_INST
            	    {
            	    if ( !((c==null)) ) {
            	        throw new FailedPredicateException(input, "pick", "c==null");
            	    }
            	    c=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_pick789);  
            	    stream_CREATE_INST.add(c);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "pick", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:27: '@name' name= STRING
            	    {
            	    string_literal58=(Token)match(input,114,FOLLOW_114_in_pick816);  
            	    stream_114.add(string_literal58);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_pick820);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:137:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "pick", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_pick829);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            string_literal59=(Token)match(input,115,FOLLOW_115_in_pick836);  
            stream_115.add(string_literal59);

            char_literal60=(Token)match(input,110,FOLLOW_110_in_pick838);  
            stream_110.add(char_literal60);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:14: ( onMessage )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==116||(LA20_0>=181 && LA20_0<=184)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:14: onMessage
            	    {
            	    pushFollow(FOLLOW_onMessage_in_pick840);
            	    onMessage61=onMessage();

            	    state._fsp--;

            	    stream_onMessage.add(onMessage61.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:25: ( onAlarm )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==SJF||LA21_0==110||LA21_0==114||(LA21_0>=119 && LA21_0<=121)||(LA21_0>=125 && LA21_0<=126)||(LA21_0>=192 && LA21_0<=195)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:25: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_pick843);
            	    onAlarm62=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm62.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            char_literal63=(Token)match(input,111,FOLLOW_111_in_pick846);  
            stream_111.add(char_literal63);



            // AST REWRITE
            // elements: CREATE_INST, onMessage, SJF, onAlarm, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:38: -> ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:41: ^( PICK ( onMessage )+ ( onAlarm )* ( CREATE_INST )? ( $name)? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PICK, "PICK"), root_1);

                if ( !(stream_onMessage.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_onMessage.hasNext() ) {
                    adaptor.addChild(root_1, stream_onMessage.nextTree());

                }
                stream_onMessage.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:59: ( onAlarm )*
                while ( stream_onAlarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_onAlarm.nextTree());

                }
                stream_onAlarm.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:68: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:81: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:138:88: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pick"

    public static class onMessage_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onMessage"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:141:1: onMessage : ({...}?pT= portType | {...}?m= msgEx )* 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) ;
    public final BPELscriptParser.onMessage_return onMessage() throws RecognitionException {
        BPELscriptParser.onMessage_return retval = new BPELscriptParser.onMessage_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token p=null;
        Token o=null;
        Token string_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        BPELscriptParser.portType_return pT = null;

        BPELscriptParser.msgEx_return m = null;

        BPELscriptParser.correlation_return correlation68 = null;

        BPELscriptParser.with_ex_return with_ex70 = null;

        BPELscriptParser.param_block_return param_block71 = null;


        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal69_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:10: ( ({...}?pT= portType | {...}?m= msgEx )* 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:12: ({...}?pT= portType | {...}?m= msgEx )* 'onMessage' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? param_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:12: ({...}?pT= portType | {...}?m= msgEx )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=181 && LA22_0<=182)) ) {
                    alt22=1;
                }
                else if ( ((LA22_0>=183 && LA22_0<=184)) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:14: {...}?pT= portType
            	    {
            	    if ( !((pT==null)) ) {
            	        throw new FailedPredicateException(input, "onMessage", "pT==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_onMessage899);
            	    pT=portType();

            	    state._fsp--;

            	    stream_portType.add(pT.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:142:40: {...}?m= msgEx
            	    {
            	    if ( !((m==null)) ) {
            	        throw new FailedPredicateException(input, "onMessage", "m==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_onMessage907);
            	    m=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(m.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            string_literal64=(Token)match(input,116,FOLLOW_116_in_onMessage914);  
            stream_116.add(string_literal64);

            char_literal65=(Token)match(input,117,FOLLOW_117_in_onMessage916);  
            stream_117.add(char_literal65);

            p=(Token)match(input,ID,FOLLOW_ID_in_onMessage920);  
            stream_ID.add(p);

            char_literal66=(Token)match(input,113,FOLLOW_113_in_onMessage922);  
            stream_113.add(char_literal66);

            o=(Token)match(input,ID,FOLLOW_ID_in_onMessage926);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:33: ( ',' correlation )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==113) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:34: ',' correlation
                    {
                    char_literal67=(Token)match(input,113,FOLLOW_113_in_onMessage929);  
                    stream_113.add(char_literal67);

                    pushFollow(FOLLOW_correlation_in_onMessage931);
                    correlation68=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation68.getTree());

                    }
                    break;

            }

            char_literal69=(Token)match(input,118,FOLLOW_118_in_onMessage935);  
            stream_118.add(char_literal69);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:56: ( with_ex )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==147) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:143:56: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onMessage937);
                    with_ex70=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex70.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_param_block_in_onMessage950);
            param_block71=param_block();

            state._fsp--;

            stream_param_block.add(param_block71.getTree());


            // AST REWRITE
            // elements: msgEx, portType, ID, ID, with_ex, param_block, correlation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 145:11: -> ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:14: ^( ONMESSAGE param_block ( portType )? ( msgEx )? ID ID ( correlation )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONMESSAGE, "ONMESSAGE"), root_1);

                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:38: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:48: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:61: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:145:74: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onMessage"

    public static class onAlarm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onAlarm"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:148:1: onAlarm : {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) ;
    public final BPELscriptParser.onAlarm_return onAlarm() throws RecognitionException {
        BPELscriptParser.onAlarm_return retval = new BPELscriptParser.onAlarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.alarm_return alarm72 = null;

        BPELscriptParser.timeout_return timeout73 = null;

        BPELscriptParser.repeatEvery_return repeatEvery74 = null;

        BPELscriptParser.scope_short_return scope_short75 = null;


        RewriteRuleSubtreeStream stream_alarm=new RewriteRuleSubtreeStream(adaptor,"rule alarm");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_repeatEvery=new RewriteRuleSubtreeStream(adaptor,"rule repeatEvery");
        RewriteRuleSubtreeStream stream_timeout=new RewriteRuleSubtreeStream(adaptor,"rule timeout");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:149:2: ({...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:151:3: {...}? ( alarm | timeout )? ( repeatEvery )? {...}? scope_short
            {
            if ( !((input.LT(1).getText().equals("alarm") || input.LT(1).getText().equals("timeout") || input.LT(1).getText().equals("repeatEvery")|| input.LT(1).getText().contains("@"))) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"alarm\") || input.LT(1).getText().equals(\"timeout\") || input.LT(1).getText().equals(\"repeatEvery\")|| input.LT(1).getText().contains(\"@\")");
            }
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:3: ( alarm | timeout )?
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:4: alarm
                    {
                    pushFollow(FOLLOW_alarm_in_onAlarm1022);
                    alarm72=alarm();

                    state._fsp--;

                    stream_alarm.add(alarm72.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:12: timeout
                    {
                    pushFollow(FOLLOW_timeout_in_onAlarm1026);
                    timeout73=timeout();

                    state._fsp--;

                    stream_timeout.add(timeout73.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:22: ( repeatEvery )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==121) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:152:22: repeatEvery
                    {
                    pushFollow(FOLLOW_repeatEvery_in_onAlarm1030);
                    repeatEvery74=repeatEvery();

                    state._fsp--;

                    stream_repeatEvery.add(repeatEvery74.getTree());

                    }
                    break;

            }

            if ( !((input.LT(1).getText().equals("{"))) ) {
                throw new FailedPredicateException(input, "onAlarm", "input.LT(1).getText().equals(\"{\")");
            }
            pushFollow(FOLLOW_scope_short_in_onAlarm1035);
            scope_short75=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short75.getTree());


            // AST REWRITE
            // elements: scope_short, alarm, timeout, repeatEvery
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:2: -> ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:5: ^( ONALARM ( alarm )? ( timeout )? ( repeatEvery )? scope_short )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ONALARM, "ONALARM"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:15: ( alarm )?
                if ( stream_alarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_alarm.nextTree());

                }
                stream_alarm.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:22: ( timeout )?
                if ( stream_timeout.hasNext() ) {
                    adaptor.addChild(root_1, stream_timeout.nextTree());

                }
                stream_timeout.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:153:31: ( repeatEvery )?
                if ( stream_repeatEvery.hasNext() ) {
                    adaptor.addChild(root_1, stream_repeatEvery.nextTree());

                }
                stream_repeatEvery.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onAlarm"

    public static class alarm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alarm"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:1: alarm : ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'alarm' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? ) ;
    public final BPELscriptParser.alarm_return alarm() throws RecognitionException {
        BPELscriptParser.alarm_return retval = new BPELscriptParser.alarm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal76=null;
        Token string_literal77=null;
        Token char_literal78=null;
        Token OPAQUE_EXPR80=null;
        Token char_literal81=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.expr_return expr79 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree char_literal78_tree=null;
        CommonTree OPAQUE_EXPR80_tree=null;
        CommonTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:8: ( ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'alarm' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:10: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'alarm' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:10: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop27:
            do {
                int alt27=5;
                switch ( input.LA(1) ) {
                case 194:
                case 195:
                    {
                    alt27=1;
                    }
                    break;
                case 192:
                case 193:
                    {
                    alt27=2;
                    }
                    break;
                case 114:
                    {
                    alt27=3;
                    }
                    break;
                case SJF:
                    {
                    alt27=4;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:12: {...}?q= queryLg
            	    {
            	    if ( !((q==null)) ) {
            	        throw new FailedPredicateException(input, "alarm", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_alarm1076);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:155:36: {...}?e= exprLg
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "alarm", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_alarm1085);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "alarm", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:27: '@name' name= STRING
            	    {
            	    string_literal76=(Token)match(input,114,FOLLOW_114_in_alarm1113);  
            	    stream_114.add(string_literal76);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_alarm1117);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:157:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "alarm", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_alarm1126);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            string_literal77=(Token)match(input,119,FOLLOW_119_in_alarm1134);  
            stream_119.add(string_literal77);

            char_literal78=(Token)match(input,117,FOLLOW_117_in_alarm1136);  
            stream_117.add(char_literal78);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:158:16: ( expr | OPAQUE_EXPR )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EXT_EXPR||LA28_0==ID||LA28_0==STRING||LA28_0==INT||LA28_0==117) ) {
                alt28=1;
            }
            else if ( (LA28_0==OPAQUE_EXPR) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:158:17: expr
                    {
                    pushFollow(FOLLOW_expr_in_alarm1139);
                    expr79=expr();

                    state._fsp--;

                    stream_expr.add(expr79.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:158:24: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR80=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_alarm1143);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR80);


                    }
                    break;

            }

            char_literal81=(Token)match(input,118,FOLLOW_118_in_alarm1146);  
            stream_118.add(char_literal81);



            // AST REWRITE
            // elements: OPAQUE_EXPR, name, queryLg, exprLg, SJF, expr
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 159:3: -> ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:7: ^( ALARM ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALARM, "ALARM"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:16: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:22: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:35: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:44: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:52: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:159:59: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alarm"

    public static class timeout_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeout"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:1: timeout : ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'timeout' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? ) ;
    public final BPELscriptParser.timeout_return timeout() throws RecognitionException {
        BPELscriptParser.timeout_return retval = new BPELscriptParser.timeout_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal82=null;
        Token string_literal83=null;
        Token char_literal84=null;
        Token OPAQUE_EXPR86=null;
        Token char_literal87=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.expr_return expr85 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree OPAQUE_EXPR86_tree=null;
        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:9: ( ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'timeout' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:11: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'timeout' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:11: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop29:
            do {
                int alt29=5;
                switch ( input.LA(1) ) {
                case 194:
                case 195:
                    {
                    alt29=1;
                    }
                    break;
                case 192:
                case 193:
                    {
                    alt29=2;
                    }
                    break;
                case 114:
                    {
                    alt29=3;
                    }
                    break;
                case SJF:
                    {
                    alt29=4;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:13: {...}?q= queryLg
            	    {
            	    if ( !((q==null)) ) {
            	        throw new FailedPredicateException(input, "timeout", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_timeout1191);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:161:37: {...}?e= exprLg
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "timeout", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_timeout1200);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "timeout", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:27: '@name' name= STRING
            	    {
            	    string_literal82=(Token)match(input,114,FOLLOW_114_in_timeout1228);  
            	    stream_114.add(string_literal82);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_timeout1232);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:163:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "timeout", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_timeout1241);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            string_literal83=(Token)match(input,120,FOLLOW_120_in_timeout1249);  
            stream_120.add(string_literal83);

            char_literal84=(Token)match(input,117,FOLLOW_117_in_timeout1251);  
            stream_117.add(char_literal84);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:18: ( expr | OPAQUE_EXPR )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==EXT_EXPR||LA30_0==ID||LA30_0==STRING||LA30_0==INT||LA30_0==117) ) {
                alt30=1;
            }
            else if ( (LA30_0==OPAQUE_EXPR) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_timeout1254);
                    expr85=expr();

                    state._fsp--;

                    stream_expr.add(expr85.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:164:26: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR86=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_timeout1258);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR86);


                    }
                    break;

            }

            char_literal87=(Token)match(input,118,FOLLOW_118_in_timeout1261);  
            stream_118.add(char_literal87);



            // AST REWRITE
            // elements: expr, SJF, OPAQUE_EXPR, queryLg, name, exprLg
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 165:3: -> ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:6: ^( TIMEOUT ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ( $name)? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TIMEOUT, "TIMEOUT"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:16: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:22: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:35: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:44: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:52: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:165:59: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeout"

    public static class repeatEvery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repeatEvery"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:167:1: repeatEvery : 'repeatEvery' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.repeatEvery_return repeatEvery() throws RecognitionException {
        BPELscriptParser.repeatEvery_return retval = new BPELscriptParser.repeatEvery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        Token char_literal89=null;
        Token OPAQUE_EXPR91=null;
        Token char_literal92=null;
        BPELscriptParser.expr_return expr90 = null;


        CommonTree string_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree OPAQUE_EXPR91_tree=null;
        CommonTree char_literal92_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:168:2: ( 'repeatEvery' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:168:4: 'repeatEvery' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            string_literal88=(Token)match(input,121,FOLLOW_121_in_repeatEvery1299);  
            stream_121.add(string_literal88);

            char_literal89=(Token)match(input,117,FOLLOW_117_in_repeatEvery1301);  
            stream_117.add(char_literal89);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:168:22: ( expr | OPAQUE_EXPR )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EXT_EXPR||LA31_0==ID||LA31_0==STRING||LA31_0==INT||LA31_0==117) ) {
                alt31=1;
            }
            else if ( (LA31_0==OPAQUE_EXPR) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:168:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_repeatEvery1304);
                    expr90=expr();

                    state._fsp--;

                    stream_expr.add(expr90.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:168:30: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR91=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_repeatEvery1308);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR91);


                    }
                    break;

            }

            char_literal92=(Token)match(input,118,FOLLOW_118_in_repeatEvery1311);  
            stream_118.add(char_literal92);



            // AST REWRITE
            // elements: OPAQUE_EXPR, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 169:2: -> ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:5: ^( REPEATEVERY ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPEATEVERY, "REPEATEVERY"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:19: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:169:25: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "repeatEvery"

    public static class flow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:1: flow : std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) ;
    public final BPELscriptParser.flow_return flow() throws RecognitionException {
        BPELscriptParser.flow_return retval = new BPELscriptParser.flow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal94=null;
        Token string_literal95=null;
        List list_s=null;
        BPELscriptParser.std_attr_return std_attr93 = null;

        BPELscriptParser.sequence_return s = null;
         s = null;
        CommonTree string_literal94_tree=null;
        CommonTree string_literal95_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:7: ( std_attr 'parallel' s+= sequence ( 'and' s+= sequence )* -> ^( FLOW ( $s)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:171:9: std_attr 'parallel' s+= sequence ( 'and' s+= sequence )*
            {
            pushFollow(FOLLOW_std_attr_in_flow1334);
            std_attr93=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr93.getTree());
            string_literal94=(Token)match(input,122,FOLLOW_122_in_flow1338);  
            stream_122.add(string_literal94);

            pushFollow(FOLLOW_sequence_in_flow1342);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            if (list_s==null) list_s=new ArrayList();
            list_s.add(s.getTree());

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:26: ( 'and' s+= sequence )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==123) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:172:28: 'and' s+= sequence
            	    {
            	    string_literal95=(Token)match(input,123,FOLLOW_123_in_flow1346);  
            	    stream_123.add(string_literal95);

            	    pushFollow(FOLLOW_sequence_in_flow1350);
            	    s=sequence();

            	    state._fsp--;

            	    stream_sequence.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTree());


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: std_attr, s
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: s
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",list_s);
            root_0 = (CommonTree)adaptor.nil();
            // 173:2: -> ^( FLOW ( $s)+ std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:173:6: ^( FLOW ( $s)+ std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FLOW, "FLOW"), root_1);

                if ( !(stream_s.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, stream_s.nextTree());

                }
                stream_s.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow"

    public static class signal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signal"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:1: signal : ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg ) 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) ;
    public final BPELscriptParser.signal_return signal() throws RecognitionException {
        BPELscriptParser.signal_return retval = new BPELscriptParser.signal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal97=null;
        Token char_literal98=null;
        Token ID99=null;
        Token char_literal100=null;
        Token OPAQUE_EXPR102=null;
        Token char_literal103=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return exprLg96 = null;

        BPELscriptParser.expr_return expr101 = null;


        CommonTree string_literal97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree ID99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree OPAQUE_EXPR102_tree=null;
        CommonTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:9: ( ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg ) 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:11: ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg ) 'signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:11: ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 194:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==STRING) ) {
                    int LA35_5 = input.LA(3);

                    if ( (!(((q==null)))) ) {
                        alt35=1;
                    }
                    else if ( ((q==null)) ) {
                        alt35=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
                }
                break;
            case 195:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==STRING) ) {
                    int LA35_6 = input.LA(3);

                    if ( (!(((q==null)))) ) {
                        alt35=1;
                    }
                    else if ( ((q==null)) ) {
                        alt35=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case 124:
                {
                alt35=1;
                }
                break;
            case 192:
            case 193:
                {
                alt35=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:13: (q= queryLg )?
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:14: (q= queryLg )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=194 && LA33_0<=195)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:14: q= queryLg
                            {
                            pushFollow(FOLLOW_queryLg_in_signal1381);
                            q=queryLg();

                            state._fsp--;

                            stream_queryLg.add(q.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:27: ( exprLg )?
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:27: ( exprLg )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=192 && LA34_0<=193)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:27: exprLg
                            {
                            pushFollow(FOLLOW_exprLg_in_signal1387);
                            exprLg96=exprLg();

                            state._fsp--;

                            stream_exprLg.add(exprLg96.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:175:38: {...}?q= queryLg
                    {
                    if ( !((q==null)) ) {
                        throw new FailedPredicateException(input, "signal", "q==null");
                    }
                    pushFollow(FOLLOW_queryLg_in_signal1397);
                    q=queryLg();

                    state._fsp--;

                    stream_queryLg.add(q.getTree());

                    }
                    break;

            }

            string_literal97=(Token)match(input,124,FOLLOW_124_in_signal1404);  
            stream_124.add(string_literal97);

            char_literal98=(Token)match(input,117,FOLLOW_117_in_signal1406);  
            stream_117.add(char_literal98);

            ID99=(Token)match(input,ID,FOLLOW_ID_in_signal1407);  
            stream_ID.add(ID99);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:19: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==113) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:20: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal100=(Token)match(input,113,FOLLOW_113_in_signal1410);  
                    stream_113.add(char_literal100);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:24: ( expr | OPAQUE_EXPR )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==EXT_EXPR||LA36_0==ID||LA36_0==STRING||LA36_0==INT||LA36_0==117) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==OPAQUE_EXPR) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:25: expr
                            {
                            pushFollow(FOLLOW_expr_in_signal1413);
                            expr101=expr();

                            state._fsp--;

                            stream_expr.add(expr101.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:32: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR102=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_signal1417);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR102);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal103=(Token)match(input,118,FOLLOW_118_in_signal1422);  
            stream_118.add(char_literal103);



            // AST REWRITE
            // elements: ID, expr, OPAQUE_EXPR, queryLg, exprLg
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 176:51: -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:54: ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:66: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:72: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:85: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:176:94: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signal"

    public static class asignal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "asignal"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:1: asignal : '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.asignal_return asignal() throws RecognitionException {
        BPELscriptParser.asignal_return retval = new BPELscriptParser.asignal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal104=null;
        Token char_literal105=null;
        Token ID106=null;
        Token char_literal107=null;
        Token OPAQUE_EXPR109=null;
        Token char_literal110=null;
        BPELscriptParser.expr_return expr108 = null;


        CommonTree string_literal104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree ID106_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree OPAQUE_EXPR109_tree=null;
        CommonTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:9: ( '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:11: '@signal' '(' ID ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal104=(Token)match(input,125,FOLLOW_125_in_asignal1450);  
            stream_125.add(string_literal104);

            char_literal105=(Token)match(input,117,FOLLOW_117_in_asignal1452);  
            stream_117.add(char_literal105);

            ID106=(Token)match(input,ID,FOLLOW_ID_in_asignal1453);  
            stream_ID.add(ID106);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:27: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==113) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:28: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal107=(Token)match(input,113,FOLLOW_113_in_asignal1456);  
                    stream_113.add(char_literal107);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:32: ( expr | OPAQUE_EXPR )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==EXT_EXPR||LA38_0==ID||LA38_0==STRING||LA38_0==INT||LA38_0==117) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==OPAQUE_EXPR) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:33: expr
                            {
                            pushFollow(FOLLOW_expr_in_asignal1459);
                            expr108=expr();

                            state._fsp--;

                            stream_expr.add(expr108.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:40: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR109=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_asignal1463);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR109);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal110=(Token)match(input,118,FOLLOW_118_in_asignal1468);  
            stream_118.add(char_literal110);



            // AST REWRITE
            // elements: OPAQUE_EXPR, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 178:59: -> ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:62: ^( SIGNAL ID ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIGNAL, "SIGNAL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:74: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:178:80: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "asignal"

    public static class ajoin_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ajoin"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:1: ajoin : '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) ;
    public final BPELscriptParser.ajoin_return ajoin() throws RecognitionException {
        BPELscriptParser.ajoin_return retval = new BPELscriptParser.ajoin_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token OPAQUE_EXPR116=null;
        Token char_literal117=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.expr_return expr115 = null;


        CommonTree string_literal111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree OPAQUE_EXPR116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:8: ( '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:10: '@join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            string_literal111=(Token)match(input,126,FOLLOW_126_in_ajoin1491);  
            stream_126.add(string_literal111);

            char_literal112=(Token)match(input,117,FOLLOW_117_in_ajoin1493);  
            stream_117.add(char_literal112);

            k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1497);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:28: ( ',' k+= ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==113) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==ID) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:29: ',' k+= ID
            	    {
            	    char_literal113=(Token)match(input,113,FOLLOW_113_in_ajoin1500);  
            	    stream_113.add(char_literal113);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_ajoin1504);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:41: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==113) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:42: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal114=(Token)match(input,113,FOLLOW_113_in_ajoin1509);  
                    stream_113.add(char_literal114);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:46: ( expr | OPAQUE_EXPR )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==EXT_EXPR||LA41_0==ID||LA41_0==STRING||LA41_0==INT||LA41_0==117) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==OPAQUE_EXPR) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:47: expr
                            {
                            pushFollow(FOLLOW_expr_in_ajoin1512);
                            expr115=expr();

                            state._fsp--;

                            stream_expr.add(expr115.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:54: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR116=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_ajoin1516);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR116);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal117=(Token)match(input,118,FOLLOW_118_in_ajoin1521);  
            stream_118.add(char_literal117);



            // AST REWRITE
            // elements: OPAQUE_EXPR, k, expr
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 180:73: -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:76: ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JOIN, "JOIN"), root_1);

                if ( !(stream_k.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_k.hasNext() ) {
                    adaptor.addChild(root_1, stream_k.nextNode());

                }
                stream_k.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:87: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:180:93: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ajoin"

    public static class join_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:1: join : ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg ) 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) ;
    public final BPELscriptParser.join_return join() throws RecognitionException {
        BPELscriptParser.join_return retval = new BPELscriptParser.join_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal119=null;
        Token char_literal120=null;
        Token char_literal121=null;
        Token char_literal122=null;
        Token OPAQUE_EXPR124=null;
        Token char_literal125=null;
        Token k=null;
        List list_k=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return exprLg118 = null;

        BPELscriptParser.expr_return expr123 = null;


        CommonTree string_literal119_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree OPAQUE_EXPR124_tree=null;
        CommonTree char_literal125_tree=null;
        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:7: ( ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg ) 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')' -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:9: ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg ) 'join' '(' k+= ID ( ',' k+= ID )* ( ',' ( expr | OPAQUE_EXPR ) )? ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:9: ( (q= queryLg )? | ( exprLg )? | {...}?q= queryLg )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 194:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==STRING) ) {
                    int LA45_5 = input.LA(3);

                    if ( (!(((q==null)))) ) {
                        alt45=1;
                    }
                    else if ( ((q==null)) ) {
                        alt45=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case 195:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==STRING) ) {
                    int LA45_6 = input.LA(3);

                    if ( (!(((q==null)))) ) {
                        alt45=1;
                    }
                    else if ( ((q==null)) ) {
                        alt45=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case 127:
                {
                alt45=1;
                }
                break;
            case 192:
            case 193:
                {
                alt45=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:11: (q= queryLg )?
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:12: (q= queryLg )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=194 && LA43_0<=195)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:12: q= queryLg
                            {
                            pushFollow(FOLLOW_queryLg_in_join1550);
                            q=queryLg();

                            state._fsp--;

                            stream_queryLg.add(q.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:25: ( exprLg )?
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:25: ( exprLg )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=192 && LA44_0<=193)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:25: exprLg
                            {
                            pushFollow(FOLLOW_exprLg_in_join1556);
                            exprLg118=exprLg();

                            state._fsp--;

                            stream_exprLg.add(exprLg118.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:182:36: {...}?q= queryLg
                    {
                    if ( !((q==null)) ) {
                        throw new FailedPredicateException(input, "join", "q==null");
                    }
                    pushFollow(FOLLOW_queryLg_in_join1566);
                    q=queryLg();

                    state._fsp--;

                    stream_queryLg.add(q.getTree());

                    }
                    break;

            }

            string_literal119=(Token)match(input,127,FOLLOW_127_in_join1572);  
            stream_127.add(string_literal119);

            char_literal120=(Token)match(input,117,FOLLOW_117_in_join1574);  
            stream_117.add(char_literal120);

            k=(Token)match(input,ID,FOLLOW_ID_in_join1578);  
            stream_ID.add(k);

            if (list_k==null) list_k=new ArrayList();
            list_k.add(k);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:21: ( ',' k+= ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==113) ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==ID) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:22: ',' k+= ID
            	    {
            	    char_literal121=(Token)match(input,113,FOLLOW_113_in_join1581);  
            	    stream_113.add(char_literal121);

            	    k=(Token)match(input,ID,FOLLOW_ID_in_join1585);  
            	    stream_ID.add(k);

            	    if (list_k==null) list_k=new ArrayList();
            	    list_k.add(k);


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:34: ( ',' ( expr | OPAQUE_EXPR ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==113) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:35: ',' ( expr | OPAQUE_EXPR )
                    {
                    char_literal122=(Token)match(input,113,FOLLOW_113_in_join1590);  
                    stream_113.add(char_literal122);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:39: ( expr | OPAQUE_EXPR )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==EXT_EXPR||LA47_0==ID||LA47_0==STRING||LA47_0==INT||LA47_0==117) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==OPAQUE_EXPR) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:40: expr
                            {
                            pushFollow(FOLLOW_expr_in_join1593);
                            expr123=expr();

                            state._fsp--;

                            stream_expr.add(expr123.getTree());

                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:47: OPAQUE_EXPR
                            {
                            OPAQUE_EXPR124=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_join1597);  
                            stream_OPAQUE_EXPR.add(OPAQUE_EXPR124);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal125=(Token)match(input,118,FOLLOW_118_in_join1602);  
            stream_118.add(char_literal125);



            // AST REWRITE
            // elements: exprLg, OPAQUE_EXPR, expr, k, queryLg
            // token labels: 
            // rule labels: retval
            // token list labels: k
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k", list_k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 183:66: -> ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:69: ^( JOIN ( $k)+ ( expr )? ( OPAQUE_EXPR )? ( queryLg )? ( exprLg )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JOIN, "JOIN"), root_1);

                if ( !(stream_k.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_k.hasNext() ) {
                    adaptor.addChild(root_1, stream_k.nextNode());

                }
                stream_k.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:80: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:86: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:99: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:183:108: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join"

    public static class if_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:185:1: if_ex : ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( ({...}?qie+= queryLg | {...}?eie+= exprLg )* 'elseif' '(' ( (eiex+= expr )? | (eiop+= OPAQUE_EXPR )? ) ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF $eiex $eiop $sei ( $qie)? ( $eie)? ) )* ( ^( ELSE $se) )? ( $name)? ( SJF )? ( queryLg )? ( exprLg )? ) ;
    public final BPELscriptParser.if_ex_return if_ex() throws RecognitionException {
        BPELscriptParser.if_ex_return retval = new BPELscriptParser.if_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token iop=null;
        Token string_literal126=null;
        Token string_literal127=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token string_literal130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        Token string_literal133=null;
        Token eiop=null;
        List list_eiop=null;
        List list_qie=null;
        List list_eie=null;
        List list_eiex=null;
        List list_sei=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.expr_return iex = null;

        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.sequence_return se = null;

        BPELscriptParser.queryLg_return qie = null;
         qie = null;
        BPELscriptParser.exprLg_return eie = null;
         eie = null;
        BPELscriptParser.expr_return eiex = null;
         eiex = null;
        BPELscriptParser.sequence_return sei = null;
         sei = null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree iop_tree=null;
        CommonTree string_literal126_tree=null;
        CommonTree string_literal127_tree=null;
        CommonTree char_literal128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree string_literal133_tree=null;
        CommonTree eiop_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        int elsex = 0, elsop = 0;
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:2: ( ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( ({...}?qie+= queryLg | {...}?eie+= exprLg )* 'elseif' '(' ( (eiex+= expr )? | (eiop+= OPAQUE_EXPR )? ) ')' sei+= sequence )* ( 'else' se= sequence )? -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF $eiex $eiop $sei ( $qie)? ( $eie)? ) )* ( ^( ELSE $se) )? ( $name)? ( SJF )? ( queryLg )? ( exprLg )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:4: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'if' '(' (iex= expr | iop= OPAQUE_EXPR ) ')' s= sequence ( ({...}?qie+= queryLg | {...}?eie+= exprLg )* 'elseif' '(' ( (eiex+= expr )? | (eiop+= OPAQUE_EXPR )? ) ')' sei+= sequence )* ( 'else' se= sequence )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:4: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop49:
            do {
                int alt49=5;
                switch ( input.LA(1) ) {
                case 194:
                case 195:
                    {
                    alt49=1;
                    }
                    break;
                case 192:
                case 193:
                    {
                    alt49=2;
                    }
                    break;
                case 114:
                    {
                    alt49=3;
                    }
                    break;
                case SJF:
                    {
                    alt49=4;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:6: {...}?q= queryLg
            	    {
            	    if ( !((q==null)) ) {
            	        throw new FailedPredicateException(input, "if_ex", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_if_ex1643);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:187:30: {...}?e= exprLg
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "if_ex", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_if_ex1652);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:189:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "if_ex", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:189:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:189:27: '@name' name= STRING
            	    {
            	    string_literal126=(Token)match(input,114,FOLLOW_114_in_if_ex1680);  
            	    stream_114.add(string_literal126);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_if_ex1684);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:189:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "if_ex", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_if_ex1693);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            string_literal127=(Token)match(input,128,FOLLOW_128_in_if_ex1700);  
            stream_128.add(string_literal127);

            char_literal128=(Token)match(input,117,FOLLOW_117_in_if_ex1702);  
            stream_117.add(char_literal128);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:12: (iex= expr | iop= OPAQUE_EXPR )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==EXT_EXPR||LA50_0==ID||LA50_0==STRING||LA50_0==INT||LA50_0==117) ) {
                alt50=1;
            }
            else if ( (LA50_0==OPAQUE_EXPR) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:13: iex= expr
                    {
                    pushFollow(FOLLOW_expr_in_if_ex1707);
                    iex=expr();

                    state._fsp--;

                    stream_expr.add(iex.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:190:24: iop= OPAQUE_EXPR
                    {
                    iop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1713);  
                    stream_OPAQUE_EXPR.add(iop);


                    }
                    break;

            }

            char_literal129=(Token)match(input,118,FOLLOW_118_in_if_ex1716);  
            stream_118.add(char_literal129);

            pushFollow(FOLLOW_sequence_in_if_ex1720);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:191:3: ( ({...}?qie+= queryLg | {...}?eie+= exprLg )* 'elseif' '(' ( (eiex+= expr )? | (eiop+= OPAQUE_EXPR )? ) ')' sei+= sequence )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case 194:
                    {
                    int LA55_2 = input.LA(2);

                    if ( ((qie==null)) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 195:
                    {
                    int LA55_3 = input.LA(2);

                    if ( ((qie==null)) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 192:
                    {
                    int LA55_4 = input.LA(2);

                    if ( ((eie==null)) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 193:
                    {
                    int LA55_5 = input.LA(2);

                    if ( ((eie==null)) ) {
                        alt55=1;
                    }


                    }
                    break;
                case 129:
                    {
                    alt55=1;
                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:191:5: ({...}?qie+= queryLg | {...}?eie+= exprLg )* 'elseif' '(' ( (eiex+= expr )? | (eiop+= OPAQUE_EXPR )? ) ')' sei+= sequence
            	    {
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:191:5: ({...}?qie+= queryLg | {...}?eie+= exprLg )*
            	    loop51:
            	    do {
            	        int alt51=3;
            	        int LA51_0 = input.LA(1);

            	        if ( ((LA51_0>=194 && LA51_0<=195)) ) {
            	            alt51=1;
            	        }
            	        else if ( ((LA51_0>=192 && LA51_0<=193)) ) {
            	            alt51=2;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:191:7: {...}?qie+= queryLg
            	    	    {
            	    	    if ( !((qie==null)) ) {
            	    	        throw new FailedPredicateException(input, "if_ex", "qie==null");
            	    	    }
            	    	    pushFollow(FOLLOW_queryLg_in_if_ex1733);
            	    	    qie=queryLg();

            	    	    state._fsp--;

            	    	    stream_queryLg.add(qie.getTree());
            	    	    if (list_qie==null) list_qie=new ArrayList();
            	    	    list_qie.add(qie.getTree());


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:191:36: {...}?eie+= exprLg
            	    	    {
            	    	    if ( !((eie==null)) ) {
            	    	        throw new FailedPredicateException(input, "if_ex", "eie==null");
            	    	    }
            	    	    pushFollow(FOLLOW_exprLg_in_if_ex1742);
            	    	    eie=exprLg();

            	    	    state._fsp--;

            	    	    stream_exprLg.add(eie.getTree());
            	    	    if (list_eie==null) list_eie=new ArrayList();
            	    	    list_eie.add(eie.getTree());


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    string_literal130=(Token)match(input,129,FOLLOW_129_in_if_ex1751);  
            	    stream_129.add(string_literal130);

            	    char_literal131=(Token)match(input,117,FOLLOW_117_in_if_ex1753);  
            	    stream_117.add(char_literal131);

            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:18: ( (eiex+= expr )? | (eiop+= OPAQUE_EXPR )? )
            	    int alt54=2;
            	    switch ( input.LA(1) ) {
            	    case EXT_EXPR:
            	    case ID:
            	    case STRING:
            	    case INT:
            	    case 117:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case 118:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case OPAQUE_EXPR:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt54) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:19: (eiex+= expr )?
            	            {
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:23: (eiex+= expr )?
            	            int alt52=2;
            	            int LA52_0 = input.LA(1);

            	            if ( (LA52_0==EXT_EXPR||LA52_0==ID||LA52_0==STRING||LA52_0==INT||LA52_0==117) ) {
            	                alt52=1;
            	            }
            	            switch (alt52) {
            	                case 1 :
            	                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:23: eiex+= expr
            	                    {
            	                    pushFollow(FOLLOW_expr_in_if_ex1758);
            	                    eiex=expr();

            	                    state._fsp--;

            	                    stream_expr.add(eiex.getTree());
            	                    if (list_eiex==null) list_eiex=new ArrayList();
            	                    list_eiex.add(eiex.getTree());


            	                    }
            	                    break;

            	            }

            	            if (list_eiop==null) {list_eiop=new ArrayList();list_eiop.add(null);}else if(list_eiop.size()==elsop) {list_eiop.add(null);} elsop++;

            	            }
            	            break;
            	        case 2 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:149: (eiop+= OPAQUE_EXPR )?
            	            {
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:153: (eiop+= OPAQUE_EXPR )?
            	            int alt53=2;
            	            int LA53_0 = input.LA(1);

            	            if ( (LA53_0==OPAQUE_EXPR) ) {
            	                alt53=1;
            	            }
            	            switch (alt53) {
            	                case 1 :
            	                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:192:153: eiop+= OPAQUE_EXPR
            	                    {
            	                    eiop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_if_ex1767);  
            	                    stream_OPAQUE_EXPR.add(eiop);

            	                    if (list_eiop==null) list_eiop=new ArrayList();
            	                    list_eiop.add(eiop);


            	                    }
            	                    break;

            	            }

            	            if (list_eiex==null) {list_eiex=new ArrayList();list_eiex.add(null); }else if(list_eiex.size()==elsex) {list_eiex.add(null);} elsex++;

            	            }
            	            break;

            	    }

            	    char_literal132=(Token)match(input,118,FOLLOW_118_in_if_ex1773);  
            	    stream_118.add(char_literal132);

            	    pushFollow(FOLLOW_sequence_in_if_ex1777);
            	    sei=sequence();

            	    state._fsp--;

            	    stream_sequence.add(sei.getTree());
            	    if (list_sei==null) list_sei=new ArrayList();
            	    list_sei.add(sei.getTree());


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:3: ( 'else' se= sequence )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==130) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:194:4: 'else' se= sequence
                    {
                    string_literal133=(Token)match(input,130,FOLLOW_130_in_if_ex1788);  
                    stream_130.add(string_literal133);

                    pushFollow(FOLLOW_sequence_in_if_ex1792);
                    se=sequence();

                    state._fsp--;

                    stream_sequence.add(se.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: iop, qie, eiex, se, name, exprLg, SJF, eiop, sei, iex, queryLg, s, eie
            // token labels: iop, name
            // rule labels: retval, s, iex, se
            // token list labels: eiop
            // rule list labels: sei, eiex, qie, eie
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_iop=new RewriteRuleTokenStream(adaptor,"token iop",iop);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_eiop=new RewriteRuleTokenStream(adaptor,"token eiop", list_eiop);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);
            RewriteRuleSubtreeStream stream_iex=new RewriteRuleSubtreeStream(adaptor,"rule iex",iex!=null?iex.tree:null);
            RewriteRuleSubtreeStream stream_se=new RewriteRuleSubtreeStream(adaptor,"rule se",se!=null?se.tree:null);
            RewriteRuleSubtreeStream stream_sei=new RewriteRuleSubtreeStream(adaptor,"token sei",list_sei);
            RewriteRuleSubtreeStream stream_eiex=new RewriteRuleSubtreeStream(adaptor,"token eiex",list_eiex);
            RewriteRuleSubtreeStream stream_qie=new RewriteRuleSubtreeStream(adaptor,"token qie",list_qie);
            RewriteRuleSubtreeStream stream_eie=new RewriteRuleSubtreeStream(adaptor,"token eie",list_eie);
            root_0 = (CommonTree)adaptor.nil();
            // 195:2: -> ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF $eiex $eiop $sei ( $qie)? ( $eie)? ) )* ( ^( ELSE $se) )? ( $name)? ( SJF )? ( queryLg )? ( exprLg )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:6: ^( IF ( $iex)? ( $iop)? $s ( ^( ELSIF $eiex $eiop $sei ( $qie)? ( $eie)? ) )* ( ^( ELSE $se) )? ( $name)? ( SJF )? ( queryLg )? ( exprLg )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:11: ( $iex)?
                if ( stream_iex.hasNext() ) {
                    adaptor.addChild(root_1, stream_iex.nextTree());

                }
                stream_iex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:17: ( $iop)?
                if ( stream_iop.hasNext() ) {
                    adaptor.addChild(root_1, stream_iop.nextNode());

                }
                stream_iop.reset();
                adaptor.addChild(root_1, stream_s.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:26: ( ^( ELSIF $eiex $eiop $sei ( $qie)? ( $eie)? ) )*
                while ( stream_eiop.hasNext()||stream_sei.hasNext()||stream_eiex.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:27: ^( ELSIF $eiex $eiop $sei ( $qie)? ( $eie)? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSIF, "ELSIF"), root_2);

                    adaptor.addChild(root_2, stream_eiex.nextTree());
                    adaptor.addChild(root_2, stream_eiop.nextNode());
                    adaptor.addChild(root_2, stream_sei.nextTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:52: ( $qie)?
                    if ( stream_qie.hasNext() ) {
                        adaptor.addChild(root_2, stream_qie.nextTree());

                    }
                    stream_qie.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:58: ( $eie)?
                    if ( stream_eie.hasNext() ) {
                        adaptor.addChild(root_2, stream_eie.nextTree());

                    }
                    stream_eie.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_eiop.reset();
                stream_sei.reset();
                stream_eiex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:67: ( ^( ELSE $se) )?
                if ( stream_se.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:68: ^( ELSE $se)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_2);

                    adaptor.addChild(root_2, stream_se.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_se.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:82: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:89: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:94: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:195:103: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_ex"

    public static class sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:197:1: sequence : std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? ) ;
    public final BPELscriptParser.sequence_return sequence() throws RecognitionException {
        BPELscriptParser.sequence_return retval = new BPELscriptParser.sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_j=null;
        List list_s=null;
        BPELscriptParser.body_return b = null;

        BPELscriptParser.std_attr_return std_attr134 = null;

        BPELscriptParser.ajoin_return j = null;
         j = null;
        BPELscriptParser.asignal_return s = null;
         s = null;
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:2: ( std_attr (j+= ajoin )? (s+= asignal )* b= body -> ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:198:4: std_attr (j+= ajoin )? (s+= asignal )* b= body
            {
            pushFollow(FOLLOW_std_attr_in_sequence1870);
            std_attr134=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr134.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:4: (j+= ajoin )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==126) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:4: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_sequence1876);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTree());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:14: (s+= asignal )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==125) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:199:14: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_sequence1881);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTree());


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            pushFollow(FOLLOW_body_in_sequence1888);
            b=body();

            state._fsp--;

            stream_body.add(b.getTree());


            // AST REWRITE
            // elements: b, j, std_attr, s
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: s, j
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",list_s);
            RewriteRuleSubtreeStream stream_j=new RewriteRuleSubtreeStream(adaptor,"token j",list_j);
            root_0 = (CommonTree)adaptor.nil();
            // 201:2: -> ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:5: ^( SEQUENCE ( $j)? $b ( $s)* ( std_attr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, stream_j.nextTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:23: ( $s)*
                while ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, stream_s.nextTree());

                }
                stream_s.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:201:27: ( std_attr )?
                if ( stream_std_attr.hasNext() ) {
                    adaptor.addChild(root_1, stream_std_attr.nextTree());

                }
                stream_std_attr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sequence"

    public static class scope_sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_sequence"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:204:1: scope_sequence : (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) ;
    public final BPELscriptParser.scope_sequence_return scope_sequence() throws RecognitionException {
        BPELscriptParser.scope_sequence_return retval = new BPELscriptParser.scope_sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        List list_j=null;
        List list_s=null;
        BPELscriptParser.scope_block_return b = null;

        BPELscriptParser.ajoin_return j = null;
         j = null;
        BPELscriptParser.asignal_return s = null;
         s = null;
        RewriteRuleSubtreeStream stream_asignal=new RewriteRuleSubtreeStream(adaptor,"rule asignal");
        RewriteRuleSubtreeStream stream_scope_block=new RewriteRuleSubtreeStream(adaptor,"rule scope_block");
        RewriteRuleSubtreeStream stream_ajoin=new RewriteRuleSubtreeStream(adaptor,"rule ajoin");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:2: ( (j+= ajoin )? (s+= asignal )* b= scope_block -> ^( SEQUENCE ( $j)? $b ( $s)* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:4: (j+= ajoin )? (s+= asignal )* b= scope_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:5: (j+= ajoin )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==126) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:5: j+= ajoin
                    {
                    pushFollow(FOLLOW_ajoin_in_scope_sequence1921);
                    j=ajoin();

                    state._fsp--;

                    stream_ajoin.add(j.getTree());
                    if (list_j==null) list_j=new ArrayList();
                    list_j.add(j.getTree());


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:15: (s+= asignal )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==125) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:205:15: s+= asignal
            	    {
            	    pushFollow(FOLLOW_asignal_in_scope_sequence1926);
            	    s=asignal();

            	    state._fsp--;

            	    stream_asignal.add(s.getTree());
            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTree());


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            pushFollow(FOLLOW_scope_block_in_scope_sequence1934);
            b=scope_block();

            state._fsp--;

            stream_scope_block.add(b.getTree());


            // AST REWRITE
            // elements: s, b, j
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: s, j
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"token s",list_s);
            RewriteRuleSubtreeStream stream_j=new RewriteRuleSubtreeStream(adaptor,"token j",list_j);
            root_0 = (CommonTree)adaptor.nil();
            // 207:2: -> ^( SEQUENCE ( $j)? $b ( $s)* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:5: ^( SEQUENCE ( $j)? $b ( $s)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:16: ( $j)?
                if ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, stream_j.nextTree());

                }
                stream_j.reset();
                adaptor.addChild(root_1, stream_b.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:207:23: ( $s)*
                while ( stream_s.hasNext() ) {
                    adaptor.addChild(root_1, stream_s.nextTree());

                }
                stream_s.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_sequence"

    public static class while_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:1: while_ex : ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? ) ;
    public final BPELscriptParser.while_ex_return while_ex() throws RecognitionException {
        BPELscriptParser.while_ex_return retval = new BPELscriptParser.while_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal135=null;
        Token string_literal136=null;
        Token char_literal137=null;
        Token OPAQUE_EXPR139=null;
        Token char_literal140=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.expr_return expr138 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree OPAQUE_EXPR139_tree=null;
        CommonTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:10: ( ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:12: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'while' '(' ( expr | OPAQUE_EXPR ) ')' s= sequence
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:12: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop61:
            do {
                int alt61=5;
                switch ( input.LA(1) ) {
                case 194:
                case 195:
                    {
                    alt61=1;
                    }
                    break;
                case 192:
                case 193:
                    {
                    alt61=2;
                    }
                    break;
                case 114:
                    {
                    alt61=3;
                    }
                    break;
                case SJF:
                    {
                    alt61=4;
                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:14: {...}?q= queryLg
            	    {
            	    if ( !((q==null)) ) {
            	        throw new FailedPredicateException(input, "while_ex", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_while_ex1966);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:209:38: {...}?e= exprLg
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "while_ex", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_while_ex1975);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "while_ex", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:27: '@name' name= STRING
            	    {
            	    string_literal135=(Token)match(input,114,FOLLOW_114_in_while_ex2003);  
            	    stream_114.add(string_literal135);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_while_ex2007);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:211:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "while_ex", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_while_ex2016);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            string_literal136=(Token)match(input,131,FOLLOW_131_in_while_ex2024);  
            stream_131.add(string_literal136);

            char_literal137=(Token)match(input,117,FOLLOW_117_in_while_ex2026);  
            stream_117.add(char_literal137);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:16: ( expr | OPAQUE_EXPR )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==EXT_EXPR||LA62_0==ID||LA62_0==STRING||LA62_0==INT||LA62_0==117) ) {
                alt62=1;
            }
            else if ( (LA62_0==OPAQUE_EXPR) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:17: expr
                    {
                    pushFollow(FOLLOW_expr_in_while_ex2029);
                    expr138=expr();

                    state._fsp--;

                    stream_expr.add(expr138.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:22: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR139=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_while_ex2031);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR139);


                    }
                    break;

            }

            char_literal140=(Token)match(input,118,FOLLOW_118_in_while_ex2034);  
            stream_118.add(char_literal140);

            pushFollow(FOLLOW_sequence_in_while_ex2038);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());


            // AST REWRITE
            // elements: exprLg, expr, name, queryLg, SJF, sequence, OPAQUE_EXPR
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 212:50: -> ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:53: ^( WHILE ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:61: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:67: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                adaptor.addChild(root_1, stream_sequence.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:89: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:96: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:101: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:212:110: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_ex"

    public static class until_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "until_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:1: until_ex : ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? ) ;
    public final BPELscriptParser.until_ex_return until_ex() throws RecognitionException {
        BPELscriptParser.until_ex_return retval = new BPELscriptParser.until_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal141=null;
        Token string_literal142=null;
        Token string_literal143=null;
        Token char_literal144=null;
        Token OPAQUE_EXPR146=null;
        Token char_literal147=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.sequence_return s = null;

        BPELscriptParser.expr_return expr145 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal141_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree string_literal143_tree=null;
        CommonTree char_literal144_tree=null;
        CommonTree OPAQUE_EXPR146_tree=null;
        CommonTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:10: ( ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR ) ')' -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:12: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'repeat' s= sequence 'until' '(' ( expr | OPAQUE_EXPR ) ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:12: ({...}?q= queryLg | {...}?e= exprLg | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop63:
            do {
                int alt63=5;
                switch ( input.LA(1) ) {
                case 194:
                case 195:
                    {
                    alt63=1;
                    }
                    break;
                case 192:
                case 193:
                    {
                    alt63=2;
                    }
                    break;
                case 114:
                    {
                    alt63=3;
                    }
                    break;
                case SJF:
                    {
                    alt63=4;
                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:14: {...}?q= queryLg
            	    {
            	    if ( !((q==null)) ) {
            	        throw new FailedPredicateException(input, "until_ex", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_until_ex2079);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:214:38: {...}?e= exprLg
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "until_ex", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_until_ex2088);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "until_ex", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:27: '@name' name= STRING
            	    {
            	    string_literal141=(Token)match(input,114,FOLLOW_114_in_until_ex2116);  
            	    stream_114.add(string_literal141);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_until_ex2120);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:216:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "until_ex", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_until_ex2129);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            string_literal142=(Token)match(input,132,FOLLOW_132_in_until_ex2137);  
            stream_132.add(string_literal142);

            pushFollow(FOLLOW_sequence_in_until_ex2141);
            s=sequence();

            state._fsp--;

            stream_sequence.add(s.getTree());
            string_literal143=(Token)match(input,133,FOLLOW_133_in_until_ex2143);  
            stream_133.add(string_literal143);

            char_literal144=(Token)match(input,117,FOLLOW_117_in_until_ex2145);  
            stream_117.add(char_literal144);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:36: ( expr | OPAQUE_EXPR )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==EXT_EXPR||LA64_0==ID||LA64_0==STRING||LA64_0==INT||LA64_0==117) ) {
                alt64=1;
            }
            else if ( (LA64_0==OPAQUE_EXPR) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:37: expr
                    {
                    pushFollow(FOLLOW_expr_in_until_ex2148);
                    expr145=expr();

                    state._fsp--;

                    stream_expr.add(expr145.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:42: OPAQUE_EXPR
                    {
                    OPAQUE_EXPR146=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_until_ex2150);  
                    stream_OPAQUE_EXPR.add(OPAQUE_EXPR146);


                    }
                    break;

            }

            char_literal147=(Token)match(input,118,FOLLOW_118_in_until_ex2153);  
            stream_118.add(char_literal147);



            // AST REWRITE
            // elements: queryLg, expr, sequence, OPAQUE_EXPR, SJF, exprLg, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 217:59: -> ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:62: ^( UNTIL ( expr )? ( OPAQUE_EXPR )? sequence ( $name)? ( SJF )? ( queryLg )? ( exprLg )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UNTIL, "UNTIL"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:70: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:76: ( OPAQUE_EXPR )?
                if ( stream_OPAQUE_EXPR.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPAQUE_EXPR.nextNode());

                }
                stream_OPAQUE_EXPR.reset();
                adaptor.addChild(root_1, stream_sequence.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:98: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:105: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:110: ( queryLg )?
                if ( stream_queryLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_queryLg.nextTree());

                }
                stream_queryLg.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:217:119: ( exprLg )?
                if ( stream_exprLg.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprLg.nextTree());

                }
                stream_exprLg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "until_ex"

    public static class foreach_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:219:1: foreach : ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'for' '(' ({...}?q= queryLg | {...}?e= exprLg )* cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) ({...}?qt= queryLg | {...}?et= exprLg )* (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) ({...}?qf= queryLg | {...}?ef= exprLg )* (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ( $qt)? ( $et)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ( $qf)? ( $ef)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? ( $q)? ( $e)? ) ;
    public final BPELscriptParser.foreach_return foreach() throws RecognitionException {
        BPELscriptParser.foreach_return retval = new BPELscriptParser.foreach_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token par=null;
        Token successfulBranchesOnly=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token cName=null;
        Token initop=null;
        Token condop=null;
        Token string_literal148=null;
        Token string_literal149=null;
        Token char_literal150=null;
        Token char_literal151=null;
        Token string_literal152=null;
        Token SEMI153=null;
        Token string_literal154=null;
        Token SEMI155=null;
        Token char_literal156=null;
        Token compop=null;
        List list_compop=null;
        List list_complete=null;
        BPELscriptParser.queryLg_return q = null;

        BPELscriptParser.exprLg_return e = null;

        BPELscriptParser.expr_return init = null;

        BPELscriptParser.queryLg_return qt = null;

        BPELscriptParser.exprLg_return et = null;

        BPELscriptParser.expr_return cond = null;

        BPELscriptParser.queryLg_return qf = null;

        BPELscriptParser.exprLg_return ef = null;

        BPELscriptParser.scope_short_return scope_short157 = null;

        BPELscriptParser.expr_return complete = null;
         complete = null;
        CommonTree par_tree=null;
        CommonTree successfulBranchesOnly_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree cName_tree=null;
        CommonTree initop_tree=null;
        CommonTree condop_tree=null;
        CommonTree string_literal148_tree=null;
        CommonTree string_literal149_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree string_literal152_tree=null;
        CommonTree SEMI153_tree=null;
        CommonTree string_literal154_tree=null;
        CommonTree SEMI155_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree compop_tree=null;
        RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_136=new RewriteRuleTokenStream(adaptor,"token 136");
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_PARALLEL=new RewriteRuleTokenStream(adaptor,"token PARALLEL");
        RewriteRuleTokenStream stream_SBO=new RewriteRuleTokenStream(adaptor,"token SBO");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_queryLg=new RewriteRuleSubtreeStream(adaptor,"rule queryLg");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprLg=new RewriteRuleSubtreeStream(adaptor,"rule exprLg");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:2: ( ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'for' '(' ({...}?q= queryLg | {...}?e= exprLg )* cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) ({...}?qt= queryLg | {...}?et= exprLg )* (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) ({...}?qf= queryLg | {...}?ef= exprLg )* (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ( $qt)? ( $et)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ( $qf)? ( $ef)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? ( $q)? ( $e)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:4: ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'for' '(' ({...}?q= queryLg | {...}?e= exprLg )* cName= ID '=' (init= expr | initop= OPAQUE_EXPR ) ( 'to' | SEMI ) ({...}?qt= queryLg | {...}?et= exprLg )* (cond= expr | condop= OPAQUE_EXPR ) ( ( 'finish' | SEMI ) ({...}?qf= queryLg | {...}?ef= exprLg )* (complete+= expr | compop+= OPAQUE_EXPR ) )? ')' scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:4: ({...}?par= PARALLEL | {...}?successfulBranchesOnly= SBO | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop65:
            do {
                int alt65=5;
                switch ( input.LA(1) ) {
                case PARALLEL:
                    {
                    alt65=1;
                    }
                    break;
                case SBO:
                    {
                    alt65=2;
                    }
                    break;
                case 114:
                    {
                    alt65=3;
                    }
                    break;
                case SJF:
                    {
                    alt65=4;
                    }
                    break;

                }

                switch (alt65) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:5: {...}?par= PARALLEL
            	    {
            	    if ( !((par==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "par==null");
            	    }
            	    par=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_foreach2195);  
            	    stream_PARALLEL.add(par);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:220:33: {...}?successfulBranchesOnly= SBO
            	    {
            	    if ( !((successfulBranchesOnly==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "successfulBranchesOnly==null");
            	    }
            	    successfulBranchesOnly=(Token)match(input,SBO,FOLLOW_SBO_in_foreach2203);  
            	    stream_SBO.add(successfulBranchesOnly);


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:27: '@name' name= STRING
            	    {
            	    string_literal148=(Token)match(input,114,FOLLOW_114_in_foreach2230);  
            	    stream_114.add(string_literal148);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_foreach2234);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:222:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_foreach2243);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            string_literal149=(Token)match(input,134,FOLLOW_134_in_foreach2250);  
            stream_134.add(string_literal149);

            char_literal150=(Token)match(input,117,FOLLOW_117_in_foreach2252);  
            stream_117.add(char_literal150);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:14: ({...}?q= queryLg | {...}?e= exprLg )*
            loop66:
            do {
                int alt66=3;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=194 && LA66_0<=195)) ) {
                    alt66=1;
                }
                else if ( ((LA66_0>=192 && LA66_0<=193)) ) {
                    alt66=2;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:15: {...}?q= queryLg
            	    {
            	    if ( !((q==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "q==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_foreach2260);
            	    q=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(q.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:39: {...}?e= exprLg
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "e==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_foreach2269);
            	    e=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(e.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            cName=(Token)match(input,ID,FOLLOW_ID_in_foreach2275);  
            stream_ID.add(cName);

            char_literal151=(Token)match(input,135,FOLLOW_135_in_foreach2277);  
            stream_135.add(char_literal151);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:74: (init= expr | initop= OPAQUE_EXPR )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EXT_EXPR||LA67_0==ID||LA67_0==STRING||LA67_0==INT||LA67_0==117) ) {
                alt67=1;
            }
            else if ( (LA67_0==OPAQUE_EXPR) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:75: init= expr
                    {
                    pushFollow(FOLLOW_expr_in_foreach2282);
                    init=expr();

                    state._fsp--;

                    stream_expr.add(init.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:223:87: initop= OPAQUE_EXPR
                    {
                    initop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach2288);  
                    stream_OPAQUE_EXPR.add(initop);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:4: ( 'to' | SEMI )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==136) ) {
                alt68=1;
            }
            else if ( (LA68_0==SEMI) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:5: 'to'
                    {
                    string_literal152=(Token)match(input,136,FOLLOW_136_in_foreach2295);  
                    stream_136.add(string_literal152);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:10: SEMI
                    {
                    SEMI153=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach2297);  
                    stream_SEMI.add(SEMI153);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:16: ({...}?qt= queryLg | {...}?et= exprLg )*
            loop69:
            do {
                int alt69=3;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=194 && LA69_0<=195)) ) {
                    alt69=1;
                }
                else if ( ((LA69_0>=192 && LA69_0<=193)) ) {
                    alt69=2;
                }


                switch (alt69) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:17: {...}?qt= queryLg
            	    {
            	    if ( !((qt==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "qt==null");
            	    }
            	    pushFollow(FOLLOW_queryLg_in_foreach2305);
            	    qt=queryLg();

            	    state._fsp--;

            	    stream_queryLg.add(qt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:43: {...}?et= exprLg
            	    {
            	    if ( !((et==null)) ) {
            	        throw new FailedPredicateException(input, "foreach", "et==null");
            	    }
            	    pushFollow(FOLLOW_exprLg_in_foreach2314);
            	    et=exprLg();

            	    state._fsp--;

            	    stream_exprLg.add(et.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:67: (cond= expr | condop= OPAQUE_EXPR )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EXT_EXPR||LA70_0==ID||LA70_0==STRING||LA70_0==INT||LA70_0==117) ) {
                alt70=1;
            }
            else if ( (LA70_0==OPAQUE_EXPR) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:68: cond= expr
                    {
                    pushFollow(FOLLOW_expr_in_foreach2321);
                    cond=expr();

                    state._fsp--;

                    stream_expr.add(cond.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:224:80: condop= OPAQUE_EXPR
                    {
                    condop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach2327);  
                    stream_OPAQUE_EXPR.add(condop);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:5: ( ( 'finish' | SEMI ) ({...}?qf= queryLg | {...}?ef= exprLg )* (complete+= expr | compop+= OPAQUE_EXPR ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==SEMI||LA74_0==137) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:6: ( 'finish' | SEMI ) ({...}?qf= queryLg | {...}?ef= exprLg )* (complete+= expr | compop+= OPAQUE_EXPR )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:6: ( 'finish' | SEMI )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==137) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==SEMI) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:7: 'finish'
                            {
                            string_literal154=(Token)match(input,137,FOLLOW_137_in_foreach2336);  
                            stream_137.add(string_literal154);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:16: SEMI
                            {
                            SEMI155=(Token)match(input,SEMI,FOLLOW_SEMI_in_foreach2338);  
                            stream_SEMI.add(SEMI155);


                            }
                            break;

                    }

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:22: ({...}?qf= queryLg | {...}?ef= exprLg )*
                    loop72:
                    do {
                        int alt72=3;
                        int LA72_0 = input.LA(1);

                        if ( ((LA72_0>=194 && LA72_0<=195)) ) {
                            alt72=1;
                        }
                        else if ( ((LA72_0>=192 && LA72_0<=193)) ) {
                            alt72=2;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:23: {...}?qf= queryLg
                    	    {
                    	    if ( !((qf==null)) ) {
                    	        throw new FailedPredicateException(input, "foreach", "qf==null");
                    	    }
                    	    pushFollow(FOLLOW_queryLg_in_foreach2346);
                    	    qf=queryLg();

                    	    state._fsp--;

                    	    stream_queryLg.add(qf.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:49: {...}?ef= exprLg
                    	    {
                    	    if ( !((ef==null)) ) {
                    	        throw new FailedPredicateException(input, "foreach", "ef==null");
                    	    }
                    	    pushFollow(FOLLOW_exprLg_in_foreach2355);
                    	    ef=exprLg();

                    	    state._fsp--;

                    	    stream_exprLg.add(ef.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:73: (complete+= expr | compop+= OPAQUE_EXPR )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==EXT_EXPR||LA73_0==ID||LA73_0==STRING||LA73_0==INT||LA73_0==117) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==OPAQUE_EXPR) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:74: complete+= expr
                            {
                            pushFollow(FOLLOW_expr_in_foreach2362);
                            complete=expr();

                            state._fsp--;

                            stream_expr.add(complete.getTree());
                            if (list_complete==null) list_complete=new ArrayList();
                            list_complete.add(complete.getTree());


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:225:91: compop+= OPAQUE_EXPR
                            {
                            compop=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_foreach2368);  
                            stream_OPAQUE_EXPR.add(compop);

                            if (list_compop==null) list_compop=new ArrayList();
                            list_compop.add(compop);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal156=(Token)match(input,118,FOLLOW_118_in_foreach2384);  
            stream_118.add(char_literal156);

            pushFollow(FOLLOW_scope_short_in_foreach2386);
            scope_short157=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short157.getTree());


            // AST REWRITE
            // elements: SJF, qf, PARALLEL, complete, ef, q, SBO, et, condop, initop, cond, name, cName, qt, scope_short, e, compop, init
            // token labels: condop, name, cName, initop
            // rule labels: retval, ef, e, q, qf, init, et, qt, cond
            // token list labels: compop
            // rule list labels: complete
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_condop=new RewriteRuleTokenStream(adaptor,"token condop",condop);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_cName=new RewriteRuleTokenStream(adaptor,"token cName",cName);
            RewriteRuleTokenStream stream_initop=new RewriteRuleTokenStream(adaptor,"token initop",initop);
            RewriteRuleTokenStream stream_compop=new RewriteRuleTokenStream(adaptor,"token compop", list_compop);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ef=new RewriteRuleSubtreeStream(adaptor,"rule ef",ef!=null?ef.tree:null);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.tree:null);
            RewriteRuleSubtreeStream stream_qf=new RewriteRuleSubtreeStream(adaptor,"rule qf",qf!=null?qf.tree:null);
            RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init",init!=null?init.tree:null);
            RewriteRuleSubtreeStream stream_et=new RewriteRuleSubtreeStream(adaptor,"rule et",et!=null?et.tree:null);
            RewriteRuleSubtreeStream stream_qt=new RewriteRuleSubtreeStream(adaptor,"rule qt",qt!=null?qt.tree:null);
            RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.tree:null);
            RewriteRuleSubtreeStream stream_complete=new RewriteRuleSubtreeStream(adaptor,"token complete",list_complete);
            root_0 = (CommonTree)adaptor.nil();
            // 227:2: -> ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ( $qt)? ( $et)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ( $qf)? ( $ef)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? ( $q)? ( $e)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:6: ^( FOR $cName ( $init)? ( $initop)? ( ^( FINAL ( $cond)? ( $condop)? ( $qt)? ( $et)? ) )? ( ^( BRANCH ( $complete)? ( $compop)? ( $qf)? ( $ef)? ) )? scope_short ( PARALLEL )? ( SBO )? ( $name)? ( SJF )? ( $q)? ( $e)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_cName.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:19: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextTree());

                }
                stream_init.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:227:26: ( $initop)?
                if ( stream_initop.hasNext() ) {
                    adaptor.addChild(root_1, stream_initop.nextNode());

                }
                stream_initop.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:228:4: ( ^( FINAL ( $cond)? ( $condop)? ( $qt)? ( $et)? ) )?
                if ( stream_cond.hasNext()||stream_qt.hasNext()||stream_et.hasNext()||stream_condop.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:228:5: ^( FINAL ( $cond)? ( $condop)? ( $qt)? ( $et)? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FINAL, "FINAL"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:228:13: ( $cond)?
                    if ( stream_cond.hasNext() ) {
                        adaptor.addChild(root_2, stream_cond.nextTree());

                    }
                    stream_cond.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:228:20: ( $condop)?
                    if ( stream_condop.hasNext() ) {
                        adaptor.addChild(root_2, stream_condop.nextNode());

                    }
                    stream_condop.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:228:29: ( $qt)?
                    if ( stream_qt.hasNext() ) {
                        adaptor.addChild(root_2, stream_qt.nextTree());

                    }
                    stream_qt.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:228:34: ( $et)?
                    if ( stream_et.hasNext() ) {
                        adaptor.addChild(root_2, stream_et.nextTree());

                    }
                    stream_et.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_cond.reset();
                stream_qt.reset();
                stream_et.reset();
                stream_condop.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:4: ( ^( BRANCH ( $complete)? ( $compop)? ( $qf)? ( $ef)? ) )?
                if ( stream_qf.hasNext()||stream_ef.hasNext()||stream_complete.hasNext()||stream_compop.hasNext() ) {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:5: ^( BRANCH ( $complete)? ( $compop)? ( $qf)? ( $ef)? )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:14: ( $complete)?
                    if ( stream_complete.hasNext() ) {
                        adaptor.addChild(root_2, stream_complete.nextTree());

                    }
                    stream_complete.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:25: ( $compop)?
                    if ( stream_compop.hasNext() ) {
                        adaptor.addChild(root_2, stream_compop.nextNode());

                    }
                    stream_compop.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:34: ( $qf)?
                    if ( stream_qf.hasNext() ) {
                        adaptor.addChild(root_2, stream_qf.nextTree());

                    }
                    stream_qf.reset();
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:229:39: ( $ef)?
                    if ( stream_ef.hasNext() ) {
                        adaptor.addChild(root_2, stream_ef.nextTree());

                    }
                    stream_ef.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_qf.reset();
                stream_ef.reset();
                stream_complete.reset();
                stream_compop.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:16: ( PARALLEL )?
                if ( stream_PARALLEL.hasNext() ) {
                    adaptor.addChild(root_1, stream_PARALLEL.nextNode());

                }
                stream_PARALLEL.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:26: ( SBO )?
                if ( stream_SBO.hasNext() ) {
                    adaptor.addChild(root_1, stream_SBO.nextNode());

                }
                stream_SBO.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:31: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:38: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:43: ( $q)?
                if ( stream_q.hasNext() ) {
                    adaptor.addChild(root_1, stream_q.nextTree());

                }
                stream_q.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:230:47: ( $e)?
                if ( stream_e.hasNext() ) {
                    adaptor.addChild(root_1, stream_e.nextTree());

                }
                stream_e.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach"

    public static class try_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "try_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:1: try_ex : 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) ;
    public final BPELscriptParser.try_ex_return try_ex() throws RecognitionException {
        BPELscriptParser.try_ex_return retval = new BPELscriptParser.try_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal158=null;
        BPELscriptParser.body_return body159 = null;

        BPELscriptParser.catch_ex_return catch_ex160 = null;

        BPELscriptParser.catchAll_return catchAll161 = null;


        CommonTree string_literal158_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_catchAll=new RewriteRuleSubtreeStream(adaptor,"rule catchAll");
        RewriteRuleSubtreeStream stream_catch_ex=new RewriteRuleSubtreeStream(adaptor,"rule catch_ex");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:9: ( 'try' body ( catch_ex )* ( catchAll )? -> ^( TRY ( catch_ex )* ( body )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:11: 'try' body ( catch_ex )* ( catchAll )?
            {
            string_literal158=(Token)match(input,138,FOLLOW_138_in_try_ex2501);  
            stream_138.add(string_literal158);

            pushFollow(FOLLOW_body_in_try_ex2503);
            body159=body();

            state._fsp--;

            stream_body.add(body159.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:22: ( catch_ex )*
            loop75:
            do {
                int alt75=2;
                switch ( input.LA(1) ) {
                case 139:
                    {
                    alt75=1;
                    }
                    break;
                case 191:
                    {
                    alt75=1;
                    }
                    break;
                case 140:
                    {
                    alt75=1;
                    }
                    break;

                }

                switch (alt75) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:22: catch_ex
            	    {
            	    pushFollow(FOLLOW_catch_ex_in_try_ex2505);
            	    catch_ex160=catch_ex();

            	    state._fsp--;

            	    stream_catch_ex.add(catch_ex160.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:32: ( catchAll )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==141) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:32: catchAll
                    {
                    pushFollow(FOLLOW_catchAll_in_try_ex2508);
                    catchAll161=catchAll();

                    state._fsp--;

                    stream_catchAll.add(catchAll161.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: catch_ex, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 233:41: -> ^( TRY ( catch_ex )* ( body )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:44: ^( TRY ( catch_ex )* ( body )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TRY, "TRY"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:50: ( catch_ex )*
                while ( stream_catch_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_catch_ex.nextTree());

                }
                stream_catch_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:233:60: ( body )?
                if ( stream_body.hasNext() ) {
                    adaptor.addChild(root_1, stream_body.nextTree());

                }
                stream_body.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "try_ex"

    public static class catch_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:235:1: catch_ex : ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) ;
    public final BPELscriptParser.catch_ex_return catch_ex() throws RecognitionException {
        BPELscriptParser.catch_ex_return retval = new BPELscriptParser.catch_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token fMT=null;
        Token string_literal162=null;
        Token string_literal164=null;
        Token char_literal165=null;
        Token char_literal167=null;
        BPELscriptParser.faultElt_return faultElt163 = null;

        BPELscriptParser.ns_id_return ns_id166 = null;

        BPELscriptParser.param_block_return param_block168 = null;


        CommonTree fMT_tree=null;
        CommonTree string_literal162_tree=null;
        CommonTree string_literal164_tree=null;
        CommonTree char_literal165_tree=null;
        CommonTree char_literal167_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_139=new RewriteRuleTokenStream(adaptor,"token 139");
        RewriteRuleTokenStream stream_140=new RewriteRuleTokenStream(adaptor,"token 140");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_faultElt=new RewriteRuleSubtreeStream(adaptor,"rule faultElt");
        RewriteRuleSubtreeStream stream_param_block=new RewriteRuleSubtreeStream(adaptor,"rule param_block");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:2: ( ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )? 'catch' '(' ns_id ')' param_block
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:4: ( ( '@faultMessageType' fMT= STRING ) | faultElt )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==139) ) {
                alt77=1;
            }
            else if ( (LA77_0==191) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:5: ( '@faultMessageType' fMT= STRING )
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:5: ( '@faultMessageType' fMT= STRING )
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:6: '@faultMessageType' fMT= STRING
                    {
                    string_literal162=(Token)match(input,139,FOLLOW_139_in_catch_ex2533);  
                    stream_139.add(string_literal162);

                    fMT=(Token)match(input,STRING,FOLLOW_STRING_in_catch_ex2537);  
                    stream_STRING.add(fMT);


                    }


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:236:41: faultElt
                    {
                    pushFollow(FOLLOW_faultElt_in_catch_ex2543);
                    faultElt163=faultElt();

                    state._fsp--;

                    stream_faultElt.add(faultElt163.getTree());

                    }
                    break;

            }

            string_literal164=(Token)match(input,140,FOLLOW_140_in_catch_ex2549);  
            stream_140.add(string_literal164);

            char_literal165=(Token)match(input,117,FOLLOW_117_in_catch_ex2551);  
            stream_117.add(char_literal165);

            pushFollow(FOLLOW_ns_id_in_catch_ex2553);
            ns_id166=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id166.getTree());
            char_literal167=(Token)match(input,118,FOLLOW_118_in_catch_ex2556);  
            stream_118.add(char_literal167);

            pushFollow(FOLLOW_param_block_in_catch_ex2558);
            param_block168=param_block();

            state._fsp--;

            stream_param_block.add(param_block168.getTree());


            // AST REWRITE
            // elements: ns_id, fMT, faultElt, param_block
            // token labels: fMT
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_fMT=new RewriteRuleTokenStream(adaptor,"token fMT",fMT);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 238:2: -> ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:6: ^( CATCH ns_id param_block ( $fMT)? ( faultElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                adaptor.addChild(root_1, stream_param_block.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:32: ( $fMT)?
                if ( stream_fMT.hasNext() ) {
                    adaptor.addChild(root_1, stream_fMT.nextNode());

                }
                stream_fMT.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:238:38: ( faultElt )?
                if ( stream_faultElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultElt.nextTree());

                }
                stream_faultElt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catch_ex"

    public static class catchAll_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchAll"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:240:1: catchAll : 'catchAll' block -> ^( CATCH block ) ;
    public final BPELscriptParser.catchAll_return catchAll() throws RecognitionException {
        BPELscriptParser.catchAll_return retval = new BPELscriptParser.catchAll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal169=null;
        BPELscriptParser.block_return block170 = null;


        CommonTree string_literal169_tree=null;
        RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:2: ( 'catchAll' block -> ^( CATCH block ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:241:4: 'catchAll' block
            {
            string_literal169=(Token)match(input,141,FOLLOW_141_in_catchAll2588);  
            stream_141.add(string_literal169);

            pushFollow(FOLLOW_block_in_catchAll2590);
            block170=block();

            state._fsp--;

            stream_block.add(block170.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 242:2: -> ^( CATCH block )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:242:6: ^( CATCH block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CATCH, "CATCH"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catchAll"

    public static class scope_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:244:1: scope_ex : ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )* 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) ;
    public final BPELscriptParser.scope_ex_return scope_ex() throws RecognitionException {
        BPELscriptParser.scope_ex_return retval = new BPELscriptParser.scope_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token i=null;
        Token eosf=null;
        Token sjf=null;
        Token string_literal171=null;
        Token char_literal172=null;
        Token ID173=null;
        Token char_literal174=null;
        BPELscriptParser.scope_sequence_return scope_sequence175 = null;

        BPELscriptParser.scope_stmt_return scope_stmt176 = null;


        CommonTree i_tree=null;
        CommonTree eosf_tree=null;
        CommonTree sjf_tree=null;
        CommonTree string_literal171_tree=null;
        CommonTree char_literal172_tree=null;
        CommonTree ID173_tree=null;
        CommonTree char_literal174_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ISOLATED=new RewriteRuleTokenStream(adaptor,"token ISOLATED");
        RewriteRuleTokenStream stream_EOSF=new RewriteRuleTokenStream(adaptor,"token EOSF");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:2: ( ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )* 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:4: ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )* 'scope' ( '(' ( ID )? ')' )? scope_sequence scope_stmt
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:4: ({...}?i= ISOLATED | {...}?eosf= EOSF | {...}?sjf= SJF )*
            loop78:
            do {
                int alt78=4;
                switch ( input.LA(1) ) {
                case ISOLATED:
                    {
                    alt78=1;
                    }
                    break;
                case EOSF:
                    {
                    alt78=2;
                    }
                    break;
                case SJF:
                    {
                    alt78=3;
                    }
                    break;

                }

                switch (alt78) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:6: {...}?i= ISOLATED
            	    {
            	    if ( !((i==null)) ) {
            	        throw new FailedPredicateException(input, "scope_ex", "i==null");
            	    }
            	    i=(Token)match(input,ISOLATED,FOLLOW_ISOLATED_in_scope_ex2615);  
            	    stream_ISOLATED.add(i);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:30: {...}?eosf= EOSF
            	    {
            	    if ( !((eosf==null)) ) {
            	        throw new FailedPredicateException(input, "scope_ex", "eosf==null");
            	    }
            	    eosf=(Token)match(input,EOSF,FOLLOW_EOSF_in_scope_ex2623);  
            	    stream_EOSF.add(eosf);


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:245:56: {...}?sjf= SJF
            	    {
            	    if ( !((sjf==null)) ) {
            	        throw new FailedPredicateException(input, "scope_ex", "sjf==null");
            	    }
            	    sjf=(Token)match(input,SJF,FOLLOW_SJF_in_scope_ex2631);  
            	    stream_SJF.add(sjf);


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            string_literal171=(Token)match(input,142,FOLLOW_142_in_scope_ex2638);  
            stream_142.add(string_literal171);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:11: ( '(' ( ID )? ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==117) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:12: '(' ( ID )? ')'
                    {
                    char_literal172=(Token)match(input,117,FOLLOW_117_in_scope_ex2641);  
                    stream_117.add(char_literal172);

                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:16: ( ID )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==ID) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:246:16: ID
                            {
                            ID173=(Token)match(input,ID,FOLLOW_ID_in_scope_ex2643);  
                            stream_ID.add(ID173);


                            }
                            break;

                    }

                    char_literal174=(Token)match(input,118,FOLLOW_118_in_scope_ex2646);  
                    stream_118.add(char_literal174);


                    }
                    break;

            }

            pushFollow(FOLLOW_scope_sequence_in_scope_ex2650);
            scope_sequence175=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence175.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_ex2652);
            scope_stmt176=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt176.getTree());


            // AST REWRITE
            // elements: scope_sequence, scope_stmt, EOSF, ISOLATED, ID, SJF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 247:2: -> ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:6: ^( SCOPE ( ID )? scope_stmt scope_sequence ( ISOLATED )? ( EOSF )? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:14: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_scope_stmt.nextTree());
                adaptor.addChild(root_1, stream_scope_sequence.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:44: ( ISOLATED )?
                if ( stream_ISOLATED.hasNext() ) {
                    adaptor.addChild(root_1, stream_ISOLATED.nextNode());

                }
                stream_ISOLATED.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:54: ( EOSF )?
                if ( stream_EOSF.hasNext() ) {
                    adaptor.addChild(root_1, stream_EOSF.nextNode());

                }
                stream_EOSF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:247:60: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_ex"

    public static class scope_short_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_short"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:250:1: scope_short : scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) ;
    public final BPELscriptParser.scope_short_return scope_short() throws RecognitionException {
        BPELscriptParser.scope_short_return retval = new BPELscriptParser.scope_short_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.scope_sequence_return scope_sequence177 = null;

        BPELscriptParser.scope_stmt_return scope_stmt178 = null;


        RewriteRuleSubtreeStream stream_scope_sequence=new RewriteRuleSubtreeStream(adaptor,"rule scope_sequence");
        RewriteRuleSubtreeStream stream_scope_stmt=new RewriteRuleSubtreeStream(adaptor,"rule scope_stmt");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:2: ( scope_sequence scope_stmt -> ^( SCOPE scope_stmt scope_sequence ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:4: scope_sequence scope_stmt
            {
            pushFollow(FOLLOW_scope_sequence_in_scope_short2695);
            scope_sequence177=scope_sequence();

            state._fsp--;

            stream_scope_sequence.add(scope_sequence177.getTree());
            pushFollow(FOLLOW_scope_stmt_in_scope_short2697);
            scope_stmt178=scope_stmt();

            state._fsp--;

            stream_scope_stmt.add(scope_stmt178.getTree());


            // AST REWRITE
            // elements: scope_stmt, scope_sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 251:30: -> ^( SCOPE scope_stmt scope_sequence )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:251:33: ^( SCOPE scope_stmt scope_sequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                adaptor.addChild(root_1, stream_scope_stmt.nextTree());
                adaptor.addChild(root_1, stream_scope_sequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_short"

    public static class scope_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scope_stmt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:253:1: scope_stmt : ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )* -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) ;
    public final BPELscriptParser.scope_stmt_return scope_stmt() throws RecognitionException {
        BPELscriptParser.scope_stmt_return retval = new BPELscriptParser.scope_stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.compensation_return c = null;

        BPELscriptParser.termination_return t = null;

        BPELscriptParser.eventHdl_return e = null;


        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_termination=new RewriteRuleSubtreeStream(adaptor,"rule termination");
        RewriteRuleSubtreeStream stream_eventHdl=new RewriteRuleSubtreeStream(adaptor,"rule eventHdl");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:2: ( ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )* -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:4: ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:4: ({...}?c= compensation | {...}?t= termination | {...}?e= eventHdl )*
            loop81:
            do {
                int alt81=4;
                switch ( input.LA(1) ) {
                case 146:
                    {
                    int LA81_2 = input.LA(2);

                    if ( ((c==null)) ) {
                        alt81=1;
                    }


                    }
                    break;
                case 143:
                    {
                    int LA81_3 = input.LA(2);

                    if ( ((t==null)) ) {
                        alt81=2;
                    }


                    }
                    break;
                case 144:
                    {
                    int LA81_4 = input.LA(2);

                    if ( ((e==null)) ) {
                        alt81=3;
                    }


                    }
                    break;

                }

                switch (alt81) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:6: {...}?c= compensation
            	    {
            	    if ( !((c==null)) ) {
            	        throw new FailedPredicateException(input, "scope_stmt", "c==null");
            	    }
            	    pushFollow(FOLLOW_compensation_in_scope_stmt2722);
            	    c=compensation();

            	    state._fsp--;

            	    stream_compensation.add(c.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:34: {...}?t= termination
            	    {
            	    if ( !((t==null)) ) {
            	        throw new FailedPredicateException(input, "scope_stmt", "t==null");
            	    }
            	    pushFollow(FOLLOW_termination_in_scope_stmt2730);
            	    t=termination();

            	    state._fsp--;

            	    stream_termination.add(t.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:254:61: {...}?e= eventHdl
            	    {
            	    if ( !((e==null)) ) {
            	        throw new FailedPredicateException(input, "scope_stmt", "e==null");
            	    }
            	    pushFollow(FOLLOW_eventHdl_in_scope_stmt2738);
            	    e=eventHdl();

            	    state._fsp--;

            	    stream_eventHdl.add(e.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);



            // AST REWRITE
            // elements: termination, eventHdl, compensation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 255:2: -> ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:5: ^( SCOPE ( compensation )? ( termination )? ( eventHdl )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SCOPE, "SCOPE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:13: ( compensation )?
                if ( stream_compensation.hasNext() ) {
                    adaptor.addChild(root_1, stream_compensation.nextTree());

                }
                stream_compensation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:27: ( termination )?
                if ( stream_termination.hasNext() ) {
                    adaptor.addChild(root_1, stream_termination.nextTree());

                }
                stream_termination.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:255:40: ( eventHdl )?
                if ( stream_eventHdl.hasNext() ) {
                    adaptor.addChild(root_1, stream_eventHdl.nextTree());

                }
                stream_eventHdl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc, "Alternative");
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scope_stmt"

    public static class termination_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termination"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:258:1: termination : 'onTermination' body -> ^( TERMINATION body ) ;
    public final BPELscriptParser.termination_return termination() throws RecognitionException {
        BPELscriptParser.termination_return retval = new BPELscriptParser.termination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal179=null;
        BPELscriptParser.body_return body180 = null;


        CommonTree string_literal179_tree=null;
        RewriteRuleTokenStream stream_143=new RewriteRuleTokenStream(adaptor,"token 143");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:2: ( 'onTermination' body -> ^( TERMINATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:4: 'onTermination' body
            {
            string_literal179=(Token)match(input,143,FOLLOW_143_in_termination2774);  
            stream_143.add(string_literal179);

            pushFollow(FOLLOW_body_in_termination2776);
            body180=body();

            state._fsp--;

            stream_body.add(body180.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 259:25: -> ^( TERMINATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:259:28: ^( TERMINATION body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TERMINATION, "TERMINATION"), root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termination"

    public static class eventHdl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eventHdl"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:261:1: eventHdl : 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) ;
    public final BPELscriptParser.eventHdl_return eventHdl() throws RecognitionException {
        BPELscriptParser.eventHdl_return retval = new BPELscriptParser.eventHdl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal181=null;
        Token char_literal182=null;
        Token char_literal185=null;
        BPELscriptParser.onEvent_return onEvent183 = null;

        BPELscriptParser.onAlarm_return onAlarm184 = null;


        CommonTree string_literal181_tree=null;
        CommonTree char_literal182_tree=null;
        CommonTree char_literal185_tree=null;
        RewriteRuleTokenStream stream_144=new RewriteRuleTokenStream(adaptor,"token 144");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_onEvent=new RewriteRuleSubtreeStream(adaptor,"rule onEvent");
        RewriteRuleSubtreeStream stream_onAlarm=new RewriteRuleSubtreeStream(adaptor,"rule onAlarm");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:2: ( 'events' '{' ( onEvent )* ( onAlarm )* '}' -> ^( EVENTHDL ( onEvent )* ( onAlarm )* ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:4: 'events' '{' ( onEvent )* ( onAlarm )* '}'
            {
            string_literal181=(Token)match(input,144,FOLLOW_144_in_eventHdl2794);  
            stream_144.add(string_literal181);

            char_literal182=(Token)match(input,110,FOLLOW_110_in_eventHdl2796);  
            stream_110.add(char_literal182);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:17: ( onEvent )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==ID||LA82_0==145||(LA82_0>=181 && LA82_0<=186)||LA82_0==188) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:17: onEvent
            	    {
            	    pushFollow(FOLLOW_onEvent_in_eventHdl2798);
            	    onEvent183=onEvent();

            	    state._fsp--;

            	    stream_onEvent.add(onEvent183.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:26: ( onAlarm )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==SJF||LA83_0==110||LA83_0==114||(LA83_0>=119 && LA83_0<=121)||(LA83_0>=125 && LA83_0<=126)||(LA83_0>=192 && LA83_0<=195)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:262:26: onAlarm
            	    {
            	    pushFollow(FOLLOW_onAlarm_in_eventHdl2801);
            	    onAlarm184=onAlarm();

            	    state._fsp--;

            	    stream_onAlarm.add(onAlarm184.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            char_literal185=(Token)match(input,111,FOLLOW_111_in_eventHdl2804);  
            stream_111.add(char_literal185);



            // AST REWRITE
            // elements: onEvent, onAlarm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 263:3: -> ^( EVENTHDL ( onEvent )* ( onAlarm )* )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:263:6: ^( EVENTHDL ( onEvent )* ( onAlarm )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENTHDL, "EVENTHDL"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:263:17: ( onEvent )*
                while ( stream_onEvent.hasNext() ) {
                    adaptor.addChild(root_1, stream_onEvent.nextTree());

                }
                stream_onEvent.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:263:26: ( onAlarm )*
                while ( stream_onAlarm.hasNext() ) {
                    adaptor.addChild(root_1, stream_onAlarm.nextTree());

                }
                stream_onAlarm.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eventHdl"

    public static class onEvent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "onEvent"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:265:1: onEvent : ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )* (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) ;
    public final BPELscriptParser.onEvent_return onEvent() throws RecognitionException {
        BPELscriptParser.onEvent_return retval = new BPELscriptParser.onEvent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token te=null;
        Token var=null;
        Token p=null;
        Token o=null;
        Token char_literal188=null;
        Token string_literal189=null;
        Token char_literal190=null;
        Token char_literal191=null;
        Token char_literal192=null;
        Token char_literal194=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.msgType_return msgType186 = null;

        BPELscriptParser.viElt_return viElt187 = null;

        BPELscriptParser.correlation_return correlation193 = null;

        BPELscriptParser.with_ex_return with_ex195 = null;

        BPELscriptParser.scope_short_return scope_short196 = null;


        CommonTree te_tree=null;
        CommonTree var_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree char_literal188_tree=null;
        CommonTree string_literal189_tree=null;
        CommonTree char_literal190_tree=null;
        CommonTree char_literal191_tree=null;
        CommonTree char_literal192_tree=null;
        CommonTree char_literal194_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_145=new RewriteRuleTokenStream(adaptor,"token 145");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_scope_short=new RewriteRuleSubtreeStream(adaptor,"rule scope_short");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:2: ( ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )* (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:4: ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )* (var= ID '=' )? 'event' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? scope_short
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:4: ({...}?pt= portType | {...}?msg= msgEx | {...}?te= ( msgType | viElt ) )*
            loop85:
            do {
                int alt85=4;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt85=1;
                    }
                    break;
                case 183:
                case 184:
                    {
                    alt85=2;
                    }
                    break;
                case 185:
                case 186:
                case 188:
                    {
                    alt85=3;
                    }
                    break;

                }

                switch (alt85) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:6: {...}?pt= portType
            	    {
            	    if ( !((pt==null)) ) {
            	        throw new FailedPredicateException(input, "onEvent", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_onEvent2835);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:32: {...}?msg= msgEx
            	    {
            	    if ( !((msg==null)) ) {
            	        throw new FailedPredicateException(input, "onEvent", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_onEvent2843);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:57: {...}?te= ( msgType | viElt )
            	    {
            	    if ( !((te==null)) ) {
            	        throw new FailedPredicateException(input, "onEvent", "te==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:72: ( msgType | viElt )
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( ((LA84_0>=185 && LA84_0<=186)) ) {
            	        alt84=1;
            	    }
            	    else if ( (LA84_0==188) ) {
            	        alt84=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 84, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:74: msgType
            	            {
            	            pushFollow(FOLLOW_msgType_in_onEvent2853);
            	            msgType186=msgType();

            	            state._fsp--;

            	            stream_msgType.add(msgType186.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:266:84: viElt
            	            {
            	            pushFollow(FOLLOW_viElt_in_onEvent2857);
            	            viElt187=viElt();

            	            state._fsp--;

            	            stream_viElt.add(viElt187.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:3: (var= ID '=' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==ID) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:4: var= ID '='
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_onEvent2869);  
                    stream_ID.add(var);

                    char_literal188=(Token)match(input,135,FOLLOW_135_in_onEvent2871);  
                    stream_135.add(char_literal188);


                    }
                    break;

            }

            string_literal189=(Token)match(input,145,FOLLOW_145_in_onEvent2876);  
            stream_145.add(string_literal189);

            char_literal190=(Token)match(input,117,FOLLOW_117_in_onEvent2878);  
            stream_117.add(char_literal190);

            p=(Token)match(input,ID,FOLLOW_ID_in_onEvent2882);  
            stream_ID.add(p);

            char_literal191=(Token)match(input,113,FOLLOW_113_in_onEvent2884);  
            stream_113.add(char_literal191);

            o=(Token)match(input,ID,FOLLOW_ID_in_onEvent2888);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:44: ( ',' correlation )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==113) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:45: ',' correlation
                    {
                    char_literal192=(Token)match(input,113,FOLLOW_113_in_onEvent2891);  
                    stream_113.add(char_literal192);

                    pushFollow(FOLLOW_correlation_in_onEvent2893);
                    correlation193=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation193.getTree());

                    }
                    break;

            }

            char_literal194=(Token)match(input,118,FOLLOW_118_in_onEvent2897);  
            stream_118.add(char_literal194);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:67: ( with_ex )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==147) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:267:67: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_onEvent2899);
                    with_ex195=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex195.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_scope_short_in_onEvent2902);
            scope_short196=scope_short();

            state._fsp--;

            stream_scope_short.add(scope_short196.getTree());


            // AST REWRITE
            // elements: p, with_ex, viElt, portType, correlation, msgType, o, var, msgEx, scope_short
            // token labels: var, p, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 268:2: -> ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:6: ^( EVENT $p $o ( correlation )? ( with_ex )? scope_short ( $var)? ( portType )? ( msgEx )? ( msgType )? ( viElt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENT, "EVENT"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:20: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:33: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                adaptor.addChild(root_1, stream_scope_short.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:54: ( $var)?
                if ( stream_var.hasNext() ) {
                    adaptor.addChild(root_1, stream_var.nextNode());

                }
                stream_var.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:60: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:70: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:77: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:268:86: ( viElt )?
                if ( stream_viElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_viElt.nextTree());

                }
                stream_viElt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "onEvent"

    public static class compensation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compensation"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:271:1: compensation : 'compensation' body -> ^( COMPENSATION body ) ;
    public final BPELscriptParser.compensation_return compensation() throws RecognitionException {
        BPELscriptParser.compensation_return retval = new BPELscriptParser.compensation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal197=null;
        BPELscriptParser.body_return body198 = null;


        CommonTree string_literal197_tree=null;
        RewriteRuleTokenStream stream_146=new RewriteRuleTokenStream(adaptor,"token 146");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:2: ( 'compensation' body -> ^( COMPENSATION body ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:4: 'compensation' body
            {
            string_literal197=(Token)match(input,146,FOLLOW_146_in_compensation2960);  
            stream_146.add(string_literal197);

            pushFollow(FOLLOW_body_in_compensation2962);
            body198=body();

            state._fsp--;

            stream_body.add(body198.getTree());


            // AST REWRITE
            // elements: body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 272:24: -> ^( COMPENSATION body )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:272:27: ^( COMPENSATION body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPENSATION, "COMPENSATION"), root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compensation"

    public static class with_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "with_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:274:1: with_ex : 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) ;
    public final BPELscriptParser.with_ex_return with_ex() throws RecognitionException {
        BPELscriptParser.with_ex_return retval = new BPELscriptParser.with_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal199=null;
        Token char_literal200=null;
        Token char_literal201=null;
        Token char_literal202=null;
        List list_wm=null;
        BPELscriptParser.with_map_return wm = null;
         wm = null;
        CommonTree string_literal199_tree=null;
        CommonTree char_literal200_tree=null;
        CommonTree char_literal201_tree=null;
        CommonTree char_literal202_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_with_map=new RewriteRuleSubtreeStream(adaptor,"rule with_map");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:3: ( 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')' -> ^( WITH ( $wm)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:6: 'with' '(' wm+= with_map ( ',' wm+= with_map )* ')'
            {
            string_literal199=(Token)match(input,147,FOLLOW_147_in_with_ex2981);  
            stream_147.add(string_literal199);

            char_literal200=(Token)match(input,117,FOLLOW_117_in_with_ex2983);  
            stream_117.add(char_literal200);

            pushFollow(FOLLOW_with_map_in_with_ex2987);
            wm=with_map();

            state._fsp--;

            stream_with_map.add(wm.getTree());
            if (list_wm==null) list_wm=new ArrayList();
            list_wm.add(wm.getTree());

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:30: ( ',' wm+= with_map )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==113) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:31: ',' wm+= with_map
            	    {
            	    char_literal201=(Token)match(input,113,FOLLOW_113_in_with_ex2990);  
            	    stream_113.add(char_literal201);

            	    pushFollow(FOLLOW_with_map_in_with_ex2994);
            	    wm=with_map();

            	    state._fsp--;

            	    stream_with_map.add(wm.getTree());
            	    if (list_wm==null) list_wm=new ArrayList();
            	    list_wm.add(wm.getTree());


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            char_literal202=(Token)match(input,118,FOLLOW_118_in_with_ex2998);  
            stream_118.add(char_literal202);



            // AST REWRITE
            // elements: wm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: wm
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_wm=new RewriteRuleSubtreeStream(adaptor,"token wm",list_wm);
            root_0 = (CommonTree)adaptor.nil();
            // 275:54: -> ^( WITH ( $wm)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:275:57: ^( WITH ( $wm)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                if ( !(stream_wm.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_wm.hasNext() ) {
                    adaptor.addChild(root_1, stream_wm.nextTree());

                }
                stream_wm.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_ex"

    public static class with_map_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "with_map"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:277:1: with_map : ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) ;
    public final BPELscriptParser.with_map_return with_map() throws RecognitionException {
        BPELscriptParser.with_map_return retval = new BPELscriptParser.with_map_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID203=null;
        Token char_literal204=null;
        Token KEY205=null;
        BPELscriptParser.path_expr_return path_expr206 = null;


        CommonTree ID203_tree=null;
        CommonTree char_literal204_tree=null;
        CommonTree KEY205_tree=null;
        RewriteRuleTokenStream stream_148=new RewriteRuleTokenStream(adaptor,"token 148");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:2: ( ID ':' ( KEY )? path_expr -> ^( MAP ID ( KEY )? path_expr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:11: ID ':' ( KEY )? path_expr
            {
            ID203=(Token)match(input,ID,FOLLOW_ID_in_with_map3024);  
            stream_ID.add(ID203);

            char_literal204=(Token)match(input,148,FOLLOW_148_in_with_map3026);  
            stream_148.add(char_literal204);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:18: ( KEY )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KEY) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:18: KEY
                    {
                    KEY205=(Token)match(input,KEY,FOLLOW_KEY_in_with_map3028);  
                    stream_KEY.add(KEY205);


                    }
                    break;

            }

            pushFollow(FOLLOW_path_expr_in_with_map3031);
            path_expr206=path_expr();

            state._fsp--;

            stream_path_expr.add(path_expr206.getTree());


            // AST REWRITE
            // elements: ID, path_expr, KEY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 278:33: -> ^( MAP ID ( KEY )? path_expr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:36: ^( MAP ID ( KEY )? path_expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP, "MAP"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:278:45: ( KEY )?
                if ( stream_KEY.hasNext() ) {
                    adaptor.addChild(root_1, stream_KEY.nextNode());

                }
                stream_KEY.reset();
                adaptor.addChild(root_1, stream_path_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "with_map"

    public static class receive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "receive"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:281:1: receive : ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? ) ;
    public final BPELscriptParser.receive_return receive() throws RecognitionException {
        BPELscriptParser.receive_return retval = new BPELscriptParser.receive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ci=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token p=null;
        Token o=null;
        Token string_literal207=null;
        Token string_literal208=null;
        Token char_literal209=null;
        Token char_literal210=null;
        Token char_literal211=null;
        Token char_literal213=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.correlation_return correlation212 = null;

        BPELscriptParser.with_ex_return with_ex214 = null;


        CommonTree ci_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree string_literal207_tree=null;
        CommonTree string_literal208_tree=null;
        CommonTree char_literal209_tree=null;
        CommonTree char_literal210_tree=null;
        CommonTree char_literal211_tree=null;
        CommonTree char_literal213_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_149=new RewriteRuleTokenStream(adaptor,"token 149");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:9: ( ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )? -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:12: ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'receive' '(' p= ID ',' o= ID ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:12: ({...}?pt= portType | {...}?msg= msgEx | {...}?ci= CREATE_INST | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop91:
            do {
                int alt91=6;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt91=1;
                    }
                    break;
                case 183:
                case 184:
                    {
                    alt91=2;
                    }
                    break;
                case CREATE_INST:
                    {
                    alt91=3;
                    }
                    break;
                case 114:
                    {
                    alt91=4;
                    }
                    break;
                case SJF:
                    {
                    alt91=5;
                    }
                    break;

                }

                switch (alt91) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:14: {...}?pt= portType
            	    {
            	    if ( !((pt==null)) ) {
            	        throw new FailedPredicateException(input, "receive", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_receive3068);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:40: {...}?msg= msgEx
            	    {
            	    if ( !((msg==null)) ) {
            	        throw new FailedPredicateException(input, "receive", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_receive3076);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:282:65: {...}?ci= CREATE_INST
            	    {
            	    if ( !((ci==null)) ) {
            	        throw new FailedPredicateException(input, "receive", "ci==null");
            	    }
            	    ci=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_receive3084);  
            	    stream_CREATE_INST.add(ci);


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:284:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "receive", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:284:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:284:27: '@name' name= STRING
            	    {
            	    string_literal207=(Token)match(input,114,FOLLOW_114_in_receive3110);  
            	    stream_114.add(string_literal207);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_receive3114);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:284:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "receive", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_receive3123);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            string_literal208=(Token)match(input,149,FOLLOW_149_in_receive3130);  
            stream_149.add(string_literal208);

            char_literal209=(Token)match(input,117,FOLLOW_117_in_receive3132);  
            stream_117.add(char_literal209);

            p=(Token)match(input,ID,FOLLOW_ID_in_receive3136);  
            stream_ID.add(p);

            char_literal210=(Token)match(input,113,FOLLOW_113_in_receive3138);  
            stream_113.add(char_literal210);

            o=(Token)match(input,ID,FOLLOW_ID_in_receive3142);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:31: ( ',' correlation )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==113) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:32: ',' correlation
                    {
                    char_literal211=(Token)match(input,113,FOLLOW_113_in_receive3145);  
                    stream_113.add(char_literal211);

                    pushFollow(FOLLOW_correlation_in_receive3147);
                    correlation212=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation212.getTree());

                    }
                    break;

            }

            char_literal213=(Token)match(input,118,FOLLOW_118_in_receive3151);  
            stream_118.add(char_literal213);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:54: ( with_ex )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==147) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:285:54: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_receive3153);
                    with_ex214=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex214.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: msgEx, o, CREATE_INST, p, with_ex, correlation, SJF, portType, name
            // token labels: name, p, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 286:2: -> ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:6: ^( RECEIVE $p $o ( correlation )? ( portType )? ( CREATE_INST )? ( msgEx )? ( $name)? ( SJF )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RECEIVE, "RECEIVE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:22: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:35: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:45: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:58: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:65: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:72: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:286:77: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "receive"

    public static class reply_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reply"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:289:1: reply : ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? ) ;
    public final BPELscriptParser.reply_return reply() throws RecognitionException {
        BPELscriptParser.reply_return retval = new BPELscriptParser.reply_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal215=null;
        Token string_literal216=null;
        Token char_literal217=null;
        Token char_literal218=null;
        Token char_literal219=null;
        Token char_literal220=null;
        Token char_literal222=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.faultName_return fn = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.correlation_return correlation221 = null;

        BPELscriptParser.with_ex_return with_ex223 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal215_tree=null;
        CommonTree string_literal216_tree=null;
        CommonTree char_literal217_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree char_literal219_tree=null;
        CommonTree char_literal220_tree=null;
        CommonTree char_literal222_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_150=new RewriteRuleTokenStream(adaptor,"token 150");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:2: ( ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:4: ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'reply' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:4: ({...}?pt= portType | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop94:
            do {
                int alt94=6;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt94=1;
                    }
                    break;
                case 189:
                case 190:
                    {
                    alt94=2;
                    }
                    break;
                case 183:
                case 184:
                    {
                    alt94=3;
                    }
                    break;
                case 114:
                    {
                    alt94=4;
                    }
                    break;
                case SJF:
                    {
                    alt94=5;
                    }
                    break;

                }

                switch (alt94) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:6: {...}?pt= portType
            	    {
            	    if ( !((pt==null)) ) {
            	        throw new FailedPredicateException(input, "reply", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_reply3212);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:32: {...}?fn= faultName
            	    {
            	    if ( !((fn==null)) ) {
            	        throw new FailedPredicateException(input, "reply", "fn==null");
            	    }
            	    pushFollow(FOLLOW_faultName_in_reply3220);
            	    fn=faultName();

            	    state._fsp--;

            	    stream_faultName.add(fn.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:290:59: {...}?msg= msgEx
            	    {
            	    if ( !((msg==null)) ) {
            	        throw new FailedPredicateException(input, "reply", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_reply3228);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:292:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "reply", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:292:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:292:27: '@name' name= STRING
            	    {
            	    string_literal215=(Token)match(input,114,FOLLOW_114_in_reply3253);  
            	    stream_114.add(string_literal215);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_reply3257);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:292:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "reply", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_reply3266);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            string_literal216=(Token)match(input,150,FOLLOW_150_in_reply3273);  
            stream_150.add(string_literal216);

            char_literal217=(Token)match(input,117,FOLLOW_117_in_reply3275);  
            stream_117.add(char_literal217);

            p=(Token)match(input,ID,FOLLOW_ID_in_reply3279);  
            stream_ID.add(p);

            char_literal218=(Token)match(input,113,FOLLOW_113_in_reply3281);  
            stream_113.add(char_literal218);

            o=(Token)match(input,ID,FOLLOW_ID_in_reply3285);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:29: ( ',' in= ID )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==113) ) {
                int LA95_1 = input.LA(2);

                if ( (LA95_1==ID) ) {
                    alt95=1;
                }
            }
            switch (alt95) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:30: ',' in= ID
                    {
                    char_literal219=(Token)match(input,113,FOLLOW_113_in_reply3288);  
                    stream_113.add(char_literal219);

                    in=(Token)match(input,ID,FOLLOW_ID_in_reply3292);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:42: ( ',' correlation )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==113) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:43: ',' correlation
                    {
                    char_literal220=(Token)match(input,113,FOLLOW_113_in_reply3297);  
                    stream_113.add(char_literal220);

                    pushFollow(FOLLOW_correlation_in_reply3299);
                    correlation221=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation221.getTree());

                    }
                    break;

            }

            char_literal222=(Token)match(input,118,FOLLOW_118_in_reply3303);  
            stream_118.add(char_literal222);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:66: ( with_ex )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==147) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:293:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_reply3306);
                    with_ex223=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex223.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: SJF, portType, ID, ID, correlation, name, with_ex, ID, msgEx, faultName
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 294:2: -> ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:6: ^( REPLY ID ID ( ID )? ( correlation )? ( portType )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REPLY, "REPLY"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:20: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:24: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:37: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:47: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:54: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:59: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:70: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:294:77: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reply"

    public static class invoke_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invoke"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:297:1: invoke : ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? ) ;
    public final BPELscriptParser.invoke_return invoke() throws RecognitionException {
        BPELscriptParser.invoke_return retval = new BPELscriptParser.invoke_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token p=null;
        Token o=null;
        Token in=null;
        Token string_literal224=null;
        Token string_literal225=null;
        Token char_literal226=null;
        Token char_literal227=null;
        Token char_literal228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.correlation_return correlation230 = null;

        BPELscriptParser.with_ex_return with_ex232 = null;

        BPELscriptParser.compensation_return compensation233 = null;


        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree p_tree=null;
        CommonTree o_tree=null;
        CommonTree in_tree=null;
        CommonTree string_literal224_tree=null;
        CommonTree string_literal225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal227_tree=null;
        CommonTree char_literal228_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree char_literal231_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_compensation=new RewriteRuleSubtreeStream(adaptor,"rule compensation");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_correlation=new RewriteRuleSubtreeStream(adaptor,"rule correlation");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:2: ( ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )? -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:4: ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'invoke' '(' p= ID ',' o= ID ( ',' in= ID )? ( ',' correlation )? ')' ( with_ex )? ( compensation )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:4: ({...}?pt= portType | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop98:
            do {
                int alt98=4;
                switch ( input.LA(1) ) {
                case 181:
                case 182:
                    {
                    alt98=1;
                    }
                    break;
                case 114:
                    {
                    alt98=2;
                    }
                    break;
                case SJF:
                    {
                    alt98=3;
                    }
                    break;

                }

                switch (alt98) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:298:6: {...}?pt= portType
            	    {
            	    if ( !((pt==null)) ) {
            	        throw new FailedPredicateException(input, "invoke", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_invoke3366);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:299:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "invoke", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:299:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:299:27: '@name' name= STRING
            	    {
            	    string_literal224=(Token)match(input,114,FOLLOW_114_in_invoke3391);  
            	    stream_114.add(string_literal224);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_invoke3395);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:299:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "invoke", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_invoke3404);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            string_literal225=(Token)match(input,151,FOLLOW_151_in_invoke3411);  
            stream_151.add(string_literal225);

            char_literal226=(Token)match(input,117,FOLLOW_117_in_invoke3413);  
            stream_117.add(char_literal226);

            p=(Token)match(input,ID,FOLLOW_ID_in_invoke3417);  
            stream_ID.add(p);

            char_literal227=(Token)match(input,113,FOLLOW_113_in_invoke3419);  
            stream_113.add(char_literal227);

            o=(Token)match(input,ID,FOLLOW_ID_in_invoke3423);  
            stream_ID.add(o);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:30: ( ',' in= ID )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==113) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==ID) ) {
                    alt99=1;
                }
            }
            switch (alt99) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:31: ',' in= ID
                    {
                    char_literal228=(Token)match(input,113,FOLLOW_113_in_invoke3426);  
                    stream_113.add(char_literal228);

                    in=(Token)match(input,ID,FOLLOW_ID_in_invoke3430);  
                    stream_ID.add(in);


                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:43: ( ',' correlation )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==113) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:44: ',' correlation
                    {
                    char_literal229=(Token)match(input,113,FOLLOW_113_in_invoke3435);  
                    stream_113.add(char_literal229);

                    pushFollow(FOLLOW_correlation_in_invoke3437);
                    correlation230=correlation();

                    state._fsp--;

                    stream_correlation.add(correlation230.getTree());

                    }
                    break;

            }

            char_literal231=(Token)match(input,118,FOLLOW_118_in_invoke3441);  
            stream_118.add(char_literal231);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:66: ( with_ex )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==147) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:66: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_invoke3443);
                    with_ex232=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex232.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:75: ( compensation )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==146) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:300:75: compensation
                    {
                    pushFollow(FOLLOW_compensation_in_invoke3446);
                    compensation233=compensation();

                    state._fsp--;

                    stream_compensation.add(compensation233.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: with_ex, SJF, compensation, p, o, portType, in, name, correlation
            // token labels: name, p, o, in
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_p=new RewriteRuleTokenStream(adaptor,"token p",p);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleTokenStream stream_in=new RewriteRuleTokenStream(adaptor,"token in",in);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 301:2: -> ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:6: ^( INVOKE $p $o ( $in)? ( correlation )? ( portType )? ( $name)? ( SJF )? ( with_ex )? ( compensation )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INVOKE, "INVOKE"), root_1);

                adaptor.addChild(root_1, stream_p.nextNode());
                adaptor.addChild(root_1, stream_o.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:21: ( $in)?
                if ( stream_in.hasNext() ) {
                    adaptor.addChild(root_1, stream_in.nextNode());

                }
                stream_in.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:26: ( correlation )?
                if ( stream_correlation.hasNext() ) {
                    adaptor.addChild(root_1, stream_correlation.nextTree());

                }
                stream_correlation.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:39: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:49: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:56: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:61: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:301:70: ( compensation )?
                if ( stream_compensation.hasNext() ) {
                    adaptor.addChild(root_1, stream_compensation.nextTree());

                }
                stream_compensation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invoke"

    public static class assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:304:1: assign : ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? ) ;
    public final BPELscriptParser.assign_return assign() throws RecognitionException {
        BPELscriptParser.assign_return retval = new BPELscriptParser.assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ci=null;
        Token val=null;
        Token ke=null;
        Token ig=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token lhs_opaque=null;
        Token string_literal234=null;
        Token PROP236=null;
        Token char_literal237=null;
        BPELscriptParser.portType_return pt = null;

        BPELscriptParser.faultName_return fn = null;

        BPELscriptParser.msgEx_return msg = null;

        BPELscriptParser.path_expr_return path_expr235 = null;

        BPELscriptParser.rvalue_return rvalue238 = null;


        CommonTree ci_tree=null;
        CommonTree val_tree=null;
        CommonTree ke_tree=null;
        CommonTree ig_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree lhs_opaque_tree=null;
        CommonTree string_literal234_tree=null;
        CommonTree PROP236_tree=null;
        CommonTree char_literal237_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_OPAQUE_EXPR=new RewriteRuleTokenStream(adaptor,"token OPAQUE_EXPR");
        RewriteRuleTokenStream stream_IGNORE=new RewriteRuleTokenStream(adaptor,"token IGNORE");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_PROP=new RewriteRuleTokenStream(adaptor,"token PROP");
        RewriteRuleTokenStream stream_KEEPSRC=new RewriteRuleTokenStream(adaptor,"token KEEPSRC");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_CREATE_INST=new RewriteRuleTokenStream(adaptor,"token CREATE_INST");
        RewriteRuleTokenStream stream_VALID=new RewriteRuleTokenStream(adaptor,"token VALID");
        RewriteRuleSubtreeStream stream_portType=new RewriteRuleSubtreeStream(adaptor,"rule portType");
        RewriteRuleSubtreeStream stream_faultName=new RewriteRuleSubtreeStream(adaptor,"rule faultName");
        RewriteRuleSubtreeStream stream_msgEx=new RewriteRuleSubtreeStream(adaptor,"rule msgEx");
        RewriteRuleSubtreeStream stream_rvalue=new RewriteRuleSubtreeStream(adaptor,"rule rvalue");
        RewriteRuleSubtreeStream stream_path_expr=new RewriteRuleSubtreeStream(adaptor,"rule path_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:2: ( ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:4: ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? ) '=' rvalue
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:4: ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop103:
            do {
                int alt103=10;
                alt103 = dfa103.predict(input);
                switch (alt103) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:6: {...}?pt= portType
            	    {
            	    if ( !((pt==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "pt==null");
            	    }
            	    pushFollow(FOLLOW_portType_in_assign3507);
            	    pt=portType();

            	    state._fsp--;

            	    stream_portType.add(pt.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:32: {...}?ci= CREATE_INST
            	    {
            	    if ( !((ci==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "ci==null");
            	    }
            	    ci=(Token)match(input,CREATE_INST,FOLLOW_CREATE_INST_in_assign3515);  
            	    stream_CREATE_INST.add(ci);


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:61: {...}?val= VALID
            	    {
            	    if ( !((val==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "val==null");
            	    }
            	    val=(Token)match(input,VALID,FOLLOW_VALID_in_assign3523);  
            	    stream_VALID.add(val);


            	    }
            	    break;
            	case 4 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:305:86: {...}?ke= KEEPSRC
            	    {
            	    if ( !((ke==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "ke==null");
            	    }
            	    ke=(Token)match(input,KEEPSRC,FOLLOW_KEEPSRC_in_assign3531);  
            	    stream_KEEPSRC.add(ke);


            	    }
            	    break;
            	case 5 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:6: {...}?ig= IGNORE
            	    {
            	    if ( !((ig==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "ig==null");
            	    }
            	    ig=(Token)match(input,IGNORE,FOLLOW_IGNORE_in_assign3543);  
            	    stream_IGNORE.add(ig);


            	    }
            	    break;
            	case 6 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:30: {...}?fn= faultName
            	    {
            	    if ( !((fn==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "fn==null");
            	    }
            	    pushFollow(FOLLOW_faultName_in_assign3551);
            	    fn=faultName();

            	    state._fsp--;

            	    stream_faultName.add(fn.getTree());

            	    }
            	    break;
            	case 7 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:306:57: {...}?msg= msgEx
            	    {
            	    if ( !((msg==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgEx_in_assign3559);
            	    msg=msgEx();

            	    state._fsp--;

            	    stream_msgEx.add(msg.getTree());

            	    }
            	    break;
            	case 8 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:27: '@name' name= STRING
            	    {
            	    string_literal234=(Token)match(input,114,FOLLOW_114_in_assign3587);  
            	    stream_114.add(string_literal234);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_assign3591);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 9 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:308:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "assign", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_assign3600);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:3: (lhs_opaque= OPAQUE_EXPR | path_expr ( PROP )? )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==OPAQUE_EXPR) ) {
                alt105=1;
            }
            else if ( (LA105_0==ID) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:4: lhs_opaque= OPAQUE_EXPR
                    {
                    lhs_opaque=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_assign3610);  
                    stream_OPAQUE_EXPR.add(lhs_opaque);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:29: path_expr ( PROP )?
                    {
                    pushFollow(FOLLOW_path_expr_in_assign3614);
                    path_expr235=path_expr();

                    state._fsp--;

                    stream_path_expr.add(path_expr235.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:39: ( PROP )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==PROP) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:309:39: PROP
                            {
                            PROP236=(Token)match(input,PROP,FOLLOW_PROP_in_assign3616);  
                            stream_PROP.add(PROP236);


                            }
                            break;

                    }


                    }
                    break;

            }

            char_literal237=(Token)match(input,135,FOLLOW_135_in_assign3620);  
            stream_135.add(char_literal237);

            pushFollow(FOLLOW_rvalue_in_assign3622);
            rvalue238=rvalue();

            state._fsp--;

            stream_rvalue.add(rvalue238.getTree());


            // AST REWRITE
            // elements: CREATE_INST, lhs_opaque, PROP, msgEx, faultName, name, VALID, portType, path_expr, KEEPSRC, SJF, rvalue, IGNORE
            // token labels: name, lhs_opaque
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_lhs_opaque=new RewriteRuleTokenStream(adaptor,"token lhs_opaque",lhs_opaque);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 310:2: -> ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:6: ^( ASSIGN ( path_expr )? ( PROP )? ( $lhs_opaque)? ( portType )? ( CREATE_INST )? ( $name)? ( SJF )? ( faultName )? ( msgEx )? ( VALID )? ( KEEPSRC )? ( IGNORE )? ( rvalue )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:15: ( path_expr )?
                if ( stream_path_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_path_expr.nextTree());

                }
                stream_path_expr.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:26: ( PROP )?
                if ( stream_PROP.hasNext() ) {
                    adaptor.addChild(root_1, stream_PROP.nextNode());

                }
                stream_PROP.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:32: ( $lhs_opaque)?
                if ( stream_lhs_opaque.hasNext() ) {
                    adaptor.addChild(root_1, stream_lhs_opaque.nextNode());

                }
                stream_lhs_opaque.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:45: ( portType )?
                if ( stream_portType.hasNext() ) {
                    adaptor.addChild(root_1, stream_portType.nextTree());

                }
                stream_portType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:55: ( CREATE_INST )?
                if ( stream_CREATE_INST.hasNext() ) {
                    adaptor.addChild(root_1, stream_CREATE_INST.nextNode());

                }
                stream_CREATE_INST.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:68: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:75: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:80: ( faultName )?
                if ( stream_faultName.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultName.nextTree());

                }
                stream_faultName.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:91: ( msgEx )?
                if ( stream_msgEx.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgEx.nextTree());

                }
                stream_msgEx.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:98: ( VALID )?
                if ( stream_VALID.hasNext() ) {
                    adaptor.addChild(root_1, stream_VALID.nextNode());

                }
                stream_VALID.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:105: ( KEEPSRC )?
                if ( stream_KEEPSRC.hasNext() ) {
                    adaptor.addChild(root_1, stream_KEEPSRC.nextNode());

                }
                stream_KEEPSRC.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:114: ( IGNORE )?
                if ( stream_IGNORE.hasNext() ) {
                    adaptor.addChild(root_1, stream_IGNORE.nextNode());

                }
                stream_IGNORE.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:310:122: ( rvalue )?
                if ( stream_rvalue.hasNext() ) {
                    adaptor.addChild(root_1, stream_rvalue.nextTree());

                }
                stream_rvalue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"

    public static class rvalue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rvalue"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:313:1: rvalue : ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR );
    public final BPELscriptParser.rvalue_return rvalue() throws RecognitionException {
        BPELscriptParser.rvalue_return retval = new BPELscriptParser.rvalue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROP242=null;
        Token OPAQUE_EXPR243=null;
        BPELscriptParser.receive_return receive239 = null;

        BPELscriptParser.invoke_return invoke240 = null;

        BPELscriptParser.expr_return expr241 = null;


        CommonTree PROP242_tree=null;
        CommonTree OPAQUE_EXPR243_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:2: ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR )
            int alt107=4;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:314:4: receive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_receive_in_rvalue3687);
                    receive239=receive();

                    state._fsp--;

                    adaptor.addChild(root_0, receive239.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:315:4: invoke
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_invoke_in_rvalue3692);
                    invoke240=invoke();

                    state._fsp--;

                    adaptor.addChild(root_0, invoke240.getTree());

                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:4: expr ( PROP )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_rvalue3697);
                    expr241=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr241.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:9: ( PROP )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==PROP) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:316:9: PROP
                            {
                            PROP242=(Token)match(input,PROP,FOLLOW_PROP_in_rvalue3699); 
                            PROP242_tree = (CommonTree)adaptor.create(PROP242);
                            adaptor.addChild(root_0, PROP242_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:317:4: OPAQUE_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OPAQUE_EXPR243=(Token)match(input,OPAQUE_EXPR,FOLLOW_OPAQUE_EXPR_in_rvalue3705); 
                    OPAQUE_EXPR243_tree = (CommonTree)adaptor.create(OPAQUE_EXPR243);
                    adaptor.addChild(root_0, OPAQUE_EXPR243_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rvalue"

    public static class throw_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throw_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:320:1: throw_ex : ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? ( $name)? ( SJF )? ) ;
    public final BPELscriptParser.throw_ex_return throw_ex() throws RecognitionException {
        BPELscriptParser.throw_ex_return retval = new BPELscriptParser.throw_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token faultVar=null;
        Token f=null;
        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal244=null;
        Token string_literal245=null;
        Token string_literal246=null;
        Token string_literal247=null;
        Token char_literal248=null;
        Token char_literal250=null;
        BPELscriptParser.ns_id_return ns_id249 = null;


        CommonTree faultVar_tree=null;
        CommonTree f_tree=null;
        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal244_tree=null;
        CommonTree string_literal245_tree=null;
        CommonTree string_literal246_tree=null;
        CommonTree string_literal247_tree=null;
        CommonTree char_literal248_tree=null;
        CommonTree char_literal250_tree=null;
        RewriteRuleTokenStream stream_152=new RewriteRuleTokenStream(adaptor,"token 152");
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:2: ( ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'throw' '(' ns_id ')' -> ^( THROW ns_id ( $faultVar)? ( $name)? ( SJF )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:4: ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* 'throw' '(' ns_id ')'
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:4: ({...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID ) | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop109:
            do {
                int alt109=4;
                switch ( input.LA(1) ) {
                case 152:
                case 153:
                    {
                    alt109=1;
                    }
                    break;
                case 114:
                    {
                    alt109=2;
                    }
                    break;
                case SJF:
                    {
                    alt109=3;
                    }
                    break;

                }

                switch (alt109) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:6: {...}?f= ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )
            	    {
            	    if ( !((f==null)) ) {
            	        throw new FailedPredicateException(input, "throw_ex", "f==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:19: ( ( '@faultVariable' | '@faultVar' ) faultVar= ID )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:20: ( '@faultVariable' | '@faultVar' ) faultVar= ID
            	    {
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:20: ( '@faultVariable' | '@faultVar' )
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==152) ) {
            	        alt108=1;
            	    }
            	    else if ( (LA108_0==153) ) {
            	        alt108=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 108, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:21: '@faultVariable'
            	            {
            	            string_literal244=(Token)match(input,152,FOLLOW_152_in_throw_ex3725);  
            	            stream_152.add(string_literal244);


            	            }
            	            break;
            	        case 2 :
            	            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:321:39: '@faultVar'
            	            {
            	            string_literal245=(Token)match(input,153,FOLLOW_153_in_throw_ex3728);  
            	            stream_153.add(string_literal245);


            	            }
            	            break;

            	    }

            	    faultVar=(Token)match(input,ID,FOLLOW_ID_in_throw_ex3733);  
            	    stream_ID.add(faultVar);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:12: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "throw_ex", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:26: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:27: '@name' name= STRING
            	    {
            	    string_literal246=(Token)match(input,114,FOLLOW_114_in_throw_ex3753);  
            	    stream_114.add(string_literal246);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_throw_ex3757);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:323:50: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "throw_ex", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_throw_ex3766);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            string_literal247=(Token)match(input,154,FOLLOW_154_in_throw_ex3773);  
            stream_154.add(string_literal247);

            char_literal248=(Token)match(input,117,FOLLOW_117_in_throw_ex3775);  
            stream_117.add(char_literal248);

            pushFollow(FOLLOW_ns_id_in_throw_ex3777);
            ns_id249=ns_id();

            state._fsp--;

            stream_ns_id.add(ns_id249.getTree());
            char_literal250=(Token)match(input,118,FOLLOW_118_in_throw_ex3779);  
            stream_118.add(char_literal250);



            // AST REWRITE
            // elements: faultVar, ns_id, SJF, name
            // token labels: faultVar, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_faultVar=new RewriteRuleTokenStream(adaptor,"token faultVar",faultVar);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 324:25: -> ^( THROW ns_id ( $faultVar)? ( $name)? ( SJF )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:28: ^( THROW ns_id ( $faultVar)? ( $name)? ( SJF )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(THROW, "THROW"), root_1);

                adaptor.addChild(root_1, stream_ns_id.nextTree());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:42: ( $faultVar)?
                if ( stream_faultVar.hasNext() ) {
                    adaptor.addChild(root_1, stream_faultVar.nextNode());

                }
                stream_faultVar.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:53: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:324:60: ( SJF )?
                if ( stream_SJF.hasNext() ) {
                    adaptor.addChild(root_1, stream_SJF.nextNode());

                }
                stream_SJF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throw_ex"

    public static class rethrow_ex_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rethrow_ex"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:327:1: rethrow_ex : std_attr 'rethrow' -> ^( RETHROW std_attr ) ;
    public final BPELscriptParser.rethrow_ex_return rethrow_ex() throws RecognitionException {
        BPELscriptParser.rethrow_ex_return retval = new BPELscriptParser.rethrow_ex_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal252=null;
        BPELscriptParser.std_attr_return std_attr251 = null;


        CommonTree string_literal252_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:328:2: ( std_attr 'rethrow' -> ^( RETHROW std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:328:4: std_attr 'rethrow'
            {
            pushFollow(FOLLOW_std_attr_in_rethrow_ex3816);
            std_attr251=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr251.getTree());
            string_literal252=(Token)match(input,155,FOLLOW_155_in_rethrow_ex3820);  
            stream_155.add(string_literal252);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 329:13: -> ^( RETHROW std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:329:16: ^( RETHROW std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETHROW, "RETHROW"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rethrow_ex"

    public static class compensate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compensate"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:331:1: compensate : std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) ;
    public final BPELscriptParser.compensate_return compensate() throws RecognitionException {
        BPELscriptParser.compensate_return retval = new BPELscriptParser.compensate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token target=null;
        Token string_literal254=null;
        Token char_literal255=null;
        Token char_literal256=null;
        BPELscriptParser.std_attr_return std_attr253 = null;


        CommonTree target_tree=null;
        CommonTree string_literal254_tree=null;
        CommonTree char_literal255_tree=null;
        CommonTree char_literal256_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:332:2: ( std_attr 'compensate' ( '(' target= ID ')' )? -> ^( COMPENSATE ( ID )? std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:332:4: std_attr 'compensate' ( '(' target= ID ')' )?
            {
            pushFollow(FOLLOW_std_attr_in_compensate3837);
            std_attr253=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr253.getTree());
            string_literal254=(Token)match(input,156,FOLLOW_156_in_compensate3841);  
            stream_156.add(string_literal254);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:333:16: ( '(' target= ID ')' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==117) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:333:17: '(' target= ID ')'
                    {
                    char_literal255=(Token)match(input,117,FOLLOW_117_in_compensate3844);  
                    stream_117.add(char_literal255);

                    target=(Token)match(input,ID,FOLLOW_ID_in_compensate3848);  
                    stream_ID.add(target);

                    char_literal256=(Token)match(input,118,FOLLOW_118_in_compensate3850);  
                    stream_118.add(char_literal256);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 334:2: -> ^( COMPENSATE ( ID )? std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:6: ^( COMPENSATE ( ID )? std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPENSATE, "COMPENSATE"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:334:19: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compensate"

    public static class exit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exit"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:1: exit : std_attr 'exit' -> ^( EXIT std_attr ) ;
    public final BPELscriptParser.exit_return exit() throws RecognitionException {
        BPELscriptParser.exit_return retval = new BPELscriptParser.exit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal258=null;
        BPELscriptParser.std_attr_return std_attr257 = null;


        CommonTree string_literal258_tree=null;
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:7: ( std_attr 'exit' -> ^( EXIT std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:336:9: std_attr 'exit'
            {
            pushFollow(FOLLOW_std_attr_in_exit3875);
            std_attr257=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr257.getTree());
            string_literal258=(Token)match(input,157,FOLLOW_157_in_exit3880);  
            stream_157.add(string_literal258);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 337:11: -> ^( EXIT std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:337:14: ^( EXIT std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXIT, "EXIT"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exit"

    public static class validate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "validate"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:1: validate : std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) ;
    public final BPELscriptParser.validate_return validate() throws RecognitionException {
        BPELscriptParser.validate_return retval = new BPELscriptParser.validate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal260=null;
        Token char_literal261=null;
        Token v=null;
        List list_v=null;
        BPELscriptParser.std_attr_return std_attr259 = null;


        CommonTree string_literal260_tree=null;
        CommonTree char_literal261_tree=null;
        CommonTree v_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:10: ( std_attr 'validate' v+= ID ( ',' v+= ID )* -> ^( VALIDATE ( $v)+ std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:339:12: std_attr 'validate' v+= ID ( ',' v+= ID )*
            {
            pushFollow(FOLLOW_std_attr_in_validate3897);
            std_attr259=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr259.getTree());
            string_literal260=(Token)match(input,158,FOLLOW_158_in_validate3902);  
            stream_158.add(string_literal260);

            v=(Token)match(input,ID,FOLLOW_ID_in_validate3906);  
            stream_ID.add(v);

            if (list_v==null) list_v=new ArrayList();
            list_v.add(v);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:21: ( ',' v+= ID )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==113) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:22: ',' v+= ID
            	    {
            	    char_literal261=(Token)match(input,113,FOLLOW_113_in_validate3909);  
            	    stream_113.add(char_literal261);

            	    v=(Token)match(input,ID,FOLLOW_ID_in_validate3913);  
            	    stream_ID.add(v);

            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v);


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);



            // AST REWRITE
            // elements: std_attr, v
            // token labels: 
            // rule labels: retval
            // token list labels: v
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v", list_v);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 340:33: -> ^( VALIDATE ( $v)+ std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:340:36: ^( VALIDATE ( $v)+ std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALIDATE, "VALIDATE"), root_1);

                if ( !(stream_v.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_v.hasNext() ) {
                    adaptor.addChild(root_1, stream_v.nextNode());

                }
                stream_v.reset();
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "validate"

    public static class ext_act_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ext_act"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:1: ext_act : std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) ;
    public final BPELscriptParser.ext_act_return ext_act() throws RecognitionException {
        BPELscriptParser.ext_act_return retval = new BPELscriptParser.ext_act_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token e=null;
        BPELscriptParser.std_attr_return std_attr262 = null;


        CommonTree e_tree=null;
        RewriteRuleTokenStream stream_EXT_ACT=new RewriteRuleTokenStream(adaptor,"token EXT_ACT");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:11: ( std_attr e= EXT_ACT -> ^( EXTENSIONACT $e std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:342:13: std_attr e= EXT_ACT
            {
            pushFollow(FOLLOW_std_attr_in_ext_act3937);
            std_attr262=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr262.getTree());
            e=(Token)match(input,EXT_ACT,FOLLOW_EXT_ACT_in_ext_act3944);  
            stream_EXT_ACT.add(e);



            // AST REWRITE
            // elements: e, std_attr
            // token labels: e
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_e=new RewriteRuleTokenStream(adaptor,"token e",e);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:14: -> ^( EXTENSIONACT $e std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:343:18: ^( EXTENSIONACT $e std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENSIONACT, "EXTENSIONACT"), root_1);

                adaptor.addChild(root_1, stream_e.nextNode());
                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ext_act"

    public static class nop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nop"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:1: nop : std_attr 'nop' -> ^( NOP std_attr ) ;
    public final BPELscriptParser.nop_return nop() throws RecognitionException {
        BPELscriptParser.nop_return retval = new BPELscriptParser.nop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal264=null;
        BPELscriptParser.std_attr_return std_attr263 = null;


        CommonTree string_literal264_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:6: ( std_attr 'nop' -> ^( NOP std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:345:8: std_attr 'nop'
            {
            pushFollow(FOLLOW_std_attr_in_nop3965);
            std_attr263=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr263.getTree());
            string_literal264=(Token)match(input,159,FOLLOW_159_in_nop3970);  
            stream_159.add(string_literal264);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 346:10: -> ^( NOP std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:346:13: ^( NOP std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NOP, "NOP"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nop"

    public static class opaque_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opaque"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:1: opaque : std_attr 'opaque()' -> ^( OPAQUE std_attr ) ;
    public final BPELscriptParser.opaque_return opaque() throws RecognitionException {
        BPELscriptParser.opaque_return retval = new BPELscriptParser.opaque_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal266=null;
        BPELscriptParser.std_attr_return std_attr265 = null;


        CommonTree string_literal266_tree=null;
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleSubtreeStream stream_std_attr=new RewriteRuleSubtreeStream(adaptor,"rule std_attr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:8: ( std_attr 'opaque()' -> ^( OPAQUE std_attr ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:348:10: std_attr 'opaque()'
            {
            pushFollow(FOLLOW_std_attr_in_opaque3989);
            std_attr265=std_attr();

            state._fsp--;

            stream_std_attr.add(std_attr265.getTree());
            string_literal266=(Token)match(input,160,FOLLOW_160_in_opaque3994);  
            stream_160.add(string_literal266);



            // AST REWRITE
            // elements: std_attr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 349:15: -> ^( OPAQUE std_attr )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:349:18: ^( OPAQUE std_attr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPAQUE, "OPAQUE"), root_1);

                adaptor.addChild(root_1, stream_std_attr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "opaque"

    public static class namespace_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:352:1: namespace : 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) ;
    public final BPELscriptParser.namespace_return namespace() throws RecognitionException {
        BPELscriptParser.namespace_return retval = new BPELscriptParser.namespace_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal267=null;
        Token ID268=null;
        Token char_literal269=null;
        Token STRING270=null;
        Token SEMI271=null;

        CommonTree string_literal267_tree=null;
        CommonTree ID268_tree=null;
        CommonTree char_literal269_tree=null;
        CommonTree STRING270_tree=null;
        CommonTree SEMI271_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:353:2: ( 'namespace' ID '=' STRING SEMI -> ^( NAMESPACE ID STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:353:4: 'namespace' ID '=' STRING SEMI
            {
            string_literal267=(Token)match(input,161,FOLLOW_161_in_namespace4013);  
            stream_161.add(string_literal267);

            ID268=(Token)match(input,ID,FOLLOW_ID_in_namespace4015);  
            stream_ID.add(ID268);

            char_literal269=(Token)match(input,135,FOLLOW_135_in_namespace4017);  
            stream_135.add(char_literal269);

            STRING270=(Token)match(input,STRING,FOLLOW_STRING_in_namespace4019);  
            stream_STRING.add(STRING270);

            SEMI271=(Token)match(input,SEMI,FOLLOW_SEMI_in_namespace4021);  
            stream_SEMI.add(SEMI271);



            // AST REWRITE
            // elements: STRING, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 353:35: -> ^( NAMESPACE ID STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:353:38: ^( NAMESPACE ID STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMESPACE, "NAMESPACE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class extension_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extension"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:355:1: extension : ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) ;
    public final BPELscriptParser.extension_return extension() throws RecognitionException {
        BPELscriptParser.extension_return retval = new BPELscriptParser.extension_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUSTUND272=null;
        Token string_literal273=null;
        Token ID274=null;
        Token char_literal275=null;
        Token STRING276=null;
        Token SEMI277=null;

        CommonTree MUSTUND272_tree=null;
        CommonTree string_literal273_tree=null;
        CommonTree ID274_tree=null;
        CommonTree char_literal275_tree=null;
        CommonTree STRING276_tree=null;
        CommonTree SEMI277_tree=null;
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_MUSTUND=new RewriteRuleTokenStream(adaptor,"token MUSTUND");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:2: ( ( MUSTUND )? 'extension' ID '=' STRING SEMI -> ^( EXTENSION ID STRING ( MUSTUND )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:5: ( MUSTUND )? 'extension' ID '=' STRING SEMI
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:5: ( MUSTUND )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==MUSTUND) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:356:5: MUSTUND
                    {
                    MUSTUND272=(Token)match(input,MUSTUND,FOLLOW_MUSTUND_in_extension4042);  
                    stream_MUSTUND.add(MUSTUND272);


                    }
                    break;

            }

            string_literal273=(Token)match(input,162,FOLLOW_162_in_extension4048);  
            stream_162.add(string_literal273);

            ID274=(Token)match(input,ID,FOLLOW_ID_in_extension4050);  
            stream_ID.add(ID274);

            char_literal275=(Token)match(input,135,FOLLOW_135_in_extension4052);  
            stream_135.add(char_literal275);

            STRING276=(Token)match(input,STRING,FOLLOW_STRING_in_extension4054);  
            stream_STRING.add(STRING276);

            SEMI277=(Token)match(input,SEMI,FOLLOW_SEMI_in_extension4056);  
            stream_SEMI.add(SEMI277);



            // AST REWRITE
            // elements: STRING, MUSTUND, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 358:2: -> ^( EXTENSION ID STRING ( MUSTUND )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:358:6: ^( EXTENSION ID STRING ( MUSTUND )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXTENSION, "EXTENSION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_STRING.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:358:28: ( MUSTUND )?
                if ( stream_MUSTUND.hasNext() ) {
                    adaptor.addChild(root_1, stream_MUSTUND.nextNode());

                }
                stream_MUSTUND.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extension"

    public static class imports_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "imports"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:360:1: imports : viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) ;
    public final BPELscriptParser.imports_return imports() throws RecognitionException {
        BPELscriptParser.imports_return retval = new BPELscriptParser.imports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        Token ns=null;
        Token loc=null;
        Token string_literal279=null;
        Token char_literal280=null;
        Token string_literal281=null;
        Token SEMI282=null;
        BPELscriptParser.viType_return viType278 = null;


        CommonTree id_tree=null;
        CommonTree ns_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal279_tree=null;
        CommonTree char_literal280_tree=null;
        CommonTree string_literal281_tree=null;
        CommonTree SEMI282_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:361:2: ( viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI -> ^( IMPORT $id $loc ( $ns)? ( viType )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:361:5: viType 'import' (id= ID '=' (ns= ID '::' )? loc= STRING ) SEMI
            {
            pushFollow(FOLLOW_viType_in_imports4081);
            viType278=viType();

            state._fsp--;

            stream_viType.add(viType278.getTree());
            string_literal279=(Token)match(input,163,FOLLOW_163_in_imports4087);  
            stream_163.add(string_literal279);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:362:12: (id= ID '=' (ns= ID '::' )? loc= STRING )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:362:13: id= ID '=' (ns= ID '::' )? loc= STRING
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_imports4092);  
            stream_ID.add(id);

            char_literal280=(Token)match(input,135,FOLLOW_135_in_imports4094);  
            stream_135.add(char_literal280);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:362:23: (ns= ID '::' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==ID) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:362:24: ns= ID '::'
                    {
                    ns=(Token)match(input,ID,FOLLOW_ID_in_imports4099);  
                    stream_ID.add(ns);

                    string_literal281=(Token)match(input,164,FOLLOW_164_in_imports4101);  
                    stream_164.add(string_literal281);


                    }
                    break;

            }

            loc=(Token)match(input,STRING,FOLLOW_STRING_in_imports4108);  
            stream_STRING.add(loc);


            }

            SEMI282=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports4112);  
            stream_SEMI.add(SEMI282);



            // AST REWRITE
            // elements: id, viType, loc, ns
            // token labels: id, ns, loc
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleTokenStream stream_ns=new RewriteRuleTokenStream(adaptor,"token ns",ns);
            RewriteRuleTokenStream stream_loc=new RewriteRuleTokenStream(adaptor,"token loc",loc);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 363:2: -> ^( IMPORT $id $loc ( $ns)? ( viType )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:6: ^( IMPORT $id $loc ( $ns)? ( viType )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT, "IMPORT"), root_1);

                adaptor.addChild(root_1, stream_id.nextNode());
                adaptor.addChild(root_1, stream_loc.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:24: ( $ns)?
                if ( stream_ns.hasNext() ) {
                    adaptor.addChild(root_1, stream_ns.nextNode());

                }
                stream_ns.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:363:29: ( viType )?
                if ( stream_viType.hasNext() ) {
                    adaptor.addChild(root_1, stream_viType.nextTree());

                }
                stream_viType.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "imports"

    public static class messages_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messages"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:365:1: messages : 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) ;
    public final BPELscriptParser.messages_return messages() throws RecognitionException {
        BPELscriptParser.messages_return retval = new BPELscriptParser.messages_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal283=null;
        Token char_literal284=null;
        List list_m=null;
        BPELscriptParser.message_return m = null;
         m = null;
        CommonTree string_literal283_tree=null;
        CommonTree char_literal284_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_message=new RewriteRuleSubtreeStream(adaptor,"rule message");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:366:2: ( 'messages' m+= message ( ',' m+= message )* -> ^( MESSAGES ( message )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:366:4: 'messages' m+= message ( ',' m+= message )*
            {
            string_literal283=(Token)match(input,165,FOLLOW_165_in_messages4144);  
            stream_165.add(string_literal283);

            pushFollow(FOLLOW_message_in_messages4148);
            m=message();

            state._fsp--;

            stream_message.add(m.getTree());
            if (list_m==null) list_m=new ArrayList();
            list_m.add(m.getTree());

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:366:26: ( ',' m+= message )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==113) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:366:27: ',' m+= message
            	    {
            	    char_literal284=(Token)match(input,113,FOLLOW_113_in_messages4151);  
            	    stream_113.add(char_literal284);

            	    pushFollow(FOLLOW_message_in_messages4155);
            	    m=message();

            	    state._fsp--;

            	    stream_message.add(m.getTree());
            	    if (list_m==null) list_m=new ArrayList();
            	    list_m.add(m.getTree());


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);



            // AST REWRITE
            // elements: message
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 366:44: -> ^( MESSAGES ( message )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:366:47: ^( MESSAGES ( message )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGES, "MESSAGES"), root_1);

                if ( !(stream_message.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_message.hasNext() ) {
                    adaptor.addChild(root_1, stream_message.nextTree());

                }
                stream_message.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "messages"

    public static class message_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:368:1: message : ID -> ^( MESSAGE ID ) ;
    public final BPELscriptParser.message_return message() throws RecognitionException {
        BPELscriptParser.message_return retval = new BPELscriptParser.message_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID285=null;

        CommonTree ID285_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:368:9: ( ID -> ^( MESSAGE ID ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:368:11: ID
            {
            ID285=(Token)match(input,ID,FOLLOW_ID_in_message4175);  
            stream_ID.add(ID285);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 368:14: -> ^( MESSAGE ID )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:368:17: ^( MESSAGE ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE, "MESSAGE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message"

    public static class variables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variables"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:1: variables : 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) ;
    public final BPELscriptParser.variables_return variables() throws RecognitionException {
        BPELscriptParser.variables_return retval = new BPELscriptParser.variables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal286=null;
        Token char_literal287=null;
        List list_v=null;
        BPELscriptParser.variable_return v = null;
         v = null;
        CommonTree string_literal286_tree=null;
        CommonTree char_literal287_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:11: ( 'var' v+= variable ( ',' v+= variable )* -> ^( VARIABLES ( variable )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:13: 'var' v+= variable ( ',' v+= variable )*
            {
            string_literal286=(Token)match(input,166,FOLLOW_166_in_variables4193);  
            stream_166.add(string_literal286);

            pushFollow(FOLLOW_variable_in_variables4197);
            v=variable();

            state._fsp--;

            stream_variable.add(v.getTree());
            if (list_v==null) list_v=new ArrayList();
            list_v.add(v.getTree());

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:31: ( ',' v+= variable )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==113) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:370:32: ',' v+= variable
            	    {
            	    char_literal287=(Token)match(input,113,FOLLOW_113_in_variables4200);  
            	    stream_113.add(char_literal287);

            	    pushFollow(FOLLOW_variable_in_variables4204);
            	    v=variable();

            	    state._fsp--;

            	    stream_variable.add(v.getTree());
            	    if (list_v==null) list_v=new ArrayList();
            	    list_v.add(v.getTree());


            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);



            // AST REWRITE
            // elements: variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 371:3: -> ^( VARIABLES ( variable )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:371:7: ^( VARIABLES ( variable )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLES, "VARIABLES"), root_1);

                if ( !(stream_variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_variable.nextTree());

                }
                stream_variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variables"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:373:1: variable : ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )* ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) ;
    public final BPELscriptParser.variable_return variable() throws RecognitionException {
        BPELscriptParser.variable_return retval = new BPELscriptParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID288=null;
        BPELscriptParser.msgType_return msg = null;

        BPELscriptParser.viType_return vi = null;

        BPELscriptParser.viElt_return viE = null;

        BPELscriptParser.with_ex_return with_ex289 = null;


        CommonTree ID288_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_with_ex=new RewriteRuleSubtreeStream(adaptor,"rule with_ex");
        RewriteRuleSubtreeStream stream_viElt=new RewriteRuleSubtreeStream(adaptor,"rule viElt");
        RewriteRuleSubtreeStream stream_msgType=new RewriteRuleSubtreeStream(adaptor,"rule msgType");
        RewriteRuleSubtreeStream stream_viType=new RewriteRuleSubtreeStream(adaptor,"rule viType");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:2: ( ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )* ID ( with_ex )? -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:4: ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )* ID ( with_ex )?
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:4: ({...}?msg= msgType | {...}?vi= viType | {...}?viE= viElt )*
            loop116:
            do {
                int alt116=4;
                switch ( input.LA(1) ) {
                case 185:
                case 186:
                    {
                    alt116=1;
                    }
                    break;
                case 187:
                    {
                    alt116=2;
                    }
                    break;
                case 188:
                    {
                    alt116=3;
                    }
                    break;

                }

                switch (alt116) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:6: {...}?msg= msgType
            	    {
            	    if ( !((msg==null)) ) {
            	        throw new FailedPredicateException(input, "variable", "msg==null");
            	    }
            	    pushFollow(FOLLOW_msgType_in_variable4234);
            	    msg=msgType();

            	    state._fsp--;

            	    stream_msgType.add(msg.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:33: {...}?vi= viType
            	    {
            	    if ( !((vi==null)) ) {
            	        throw new FailedPredicateException(input, "variable", "vi==null");
            	    }
            	    pushFollow(FOLLOW_viType_in_variable4242);
            	    vi=viType();

            	    state._fsp--;

            	    stream_viType.add(vi.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:374:57: {...}?viE= viElt
            	    {
            	    if ( !((viE==null)) ) {
            	        throw new FailedPredicateException(input, "variable", "viE==null");
            	    }
            	    pushFollow(FOLLOW_viElt_in_variable4250);
            	    viE=viElt();

            	    state._fsp--;

            	    stream_viElt.add(viE.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            ID288=(Token)match(input,ID,FOLLOW_ID_in_variable4257);  
            stream_ID.add(ID288);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:7: ( with_ex )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==147) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:375:7: with_ex
                    {
                    pushFollow(FOLLOW_with_ex_in_variable4260);
                    with_ex289=with_ex();

                    state._fsp--;

                    stream_with_ex.add(with_ex289.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: msgType, with_ex, viElt, ID, viType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 376:2: -> ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:376:6: ^( VARIABLE ID ( msgType )? ( viType )? ( viElt )? ( with_ex )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARIABLE, "VARIABLE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:376:20: ( msgType )?
                if ( stream_msgType.hasNext() ) {
                    adaptor.addChild(root_1, stream_msgType.nextTree());

                }
                stream_msgType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:376:29: ( viType )?
                if ( stream_viType.hasNext() ) {
                    adaptor.addChild(root_1, stream_viType.nextTree());

                }
                stream_viType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:376:37: ( viElt )?
                if ( stream_viElt.hasNext() ) {
                    adaptor.addChild(root_1, stream_viElt.nextTree());

                }
                stream_viElt.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:376:44: ( with_ex )?
                if ( stream_with_ex.hasNext() ) {
                    adaptor.addChild(root_1, stream_with_ex.nextTree());

                }
                stream_with_ex.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class partner_links_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "partner_links"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:379:1: partner_links : ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) ;
    public final BPELscriptParser.partner_links_return partner_links() throws RecognitionException {
        BPELscriptParser.partner_links_return retval = new BPELscriptParser.partner_links_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal290=null;
        Token string_literal291=null;
        Token char_literal292=null;
        List list_pl=null;
        BPELscriptParser.partner_link_return pl = null;
         pl = null;
        CommonTree string_literal290_tree=null;
        CommonTree string_literal291_tree=null;
        CommonTree char_literal292_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_168=new RewriteRuleTokenStream(adaptor,"token 168");
        RewriteRuleTokenStream stream_167=new RewriteRuleTokenStream(adaptor,"token 167");
        RewriteRuleSubtreeStream stream_partner_link=new RewriteRuleSubtreeStream(adaptor,"rule partner_link");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:2: ( ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )* -> ^( PARTNERLINKS ( $pl)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:4: ( 'partnerLink' | 'partnerlink' ) pl+= partner_link ( ',' pl+= partner_link )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:4: ( 'partnerLink' | 'partnerlink' )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==167) ) {
                alt118=1;
            }
            else if ( (LA118_0==168) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:5: 'partnerLink'
                    {
                    string_literal290=(Token)match(input,167,FOLLOW_167_in_partner_links4300);  
                    stream_167.add(string_literal290);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:21: 'partnerlink'
                    {
                    string_literal291=(Token)match(input,168,FOLLOW_168_in_partner_links4304);  
                    stream_168.add(string_literal291);


                    }
                    break;

            }

            pushFollow(FOLLOW_partner_link_in_partner_links4309);
            pl=partner_link();

            state._fsp--;

            stream_partner_link.add(pl.getTree());
            if (list_pl==null) list_pl=new ArrayList();
            list_pl.add(pl.getTree());

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:53: ( ',' pl+= partner_link )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==113) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:54: ',' pl+= partner_link
            	    {
            	    char_literal292=(Token)match(input,113,FOLLOW_113_in_partner_links4312);  
            	    stream_113.add(char_literal292);

            	    pushFollow(FOLLOW_partner_link_in_partner_links4316);
            	    pl=partner_link();

            	    state._fsp--;

            	    stream_partner_link.add(pl.getTree());
            	    if (list_pl==null) list_pl=new ArrayList();
            	    list_pl.add(pl.getTree());


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);



            // AST REWRITE
            // elements: pl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: pl
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pl=new RewriteRuleSubtreeStream(adaptor,"token pl",list_pl);
            root_0 = (CommonTree)adaptor.nil();
            // 380:77: -> ^( PARTNERLINKS ( $pl)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:380:80: ^( PARTNERLINKS ( $pl)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARTNERLINKS, "PARTNERLINKS"), root_1);

                if ( !(stream_pl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pl.hasNext() ) {
                    adaptor.addChild(root_1, stream_pl.nextTree());

                }
                stream_pl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "partner_links"

    public static class partner_link_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "partner_link"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:382:1: partner_link : ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) ;
    public final BPELscriptParser.partner_link_return partner_link() throws RecognitionException {
        BPELscriptParser.partner_link_return retval = new BPELscriptParser.partner_link_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token init=null;
        Token ID293=null;
        Token char_literal294=null;
        Token char_literal295=null;
        Token char_literal296=null;
        Token char_literal297=null;
        Token char_literal298=null;
        Token char_literal299=null;
        BPELscriptParser.ns_id_return plType = null;

        BPELscriptParser.ns_id_return roleA = null;

        BPELscriptParser.ns_id_return roleB = null;


        CommonTree init_tree=null;
        CommonTree ID293_tree=null;
        CommonTree char_literal294_tree=null;
        CommonTree char_literal295_tree=null;
        CommonTree char_literal296_tree=null;
        CommonTree char_literal297_tree=null;
        CommonTree char_literal298_tree=null;
        CommonTree char_literal299_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_INITPARTNER=new RewriteRuleTokenStream(adaptor,"token INITPARTNER");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:2: ( ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')' -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:4: ID '=' '(' (plType= ns_id )? ( ',' roleA= ns_id )? ( ',' roleB= ns_id )? ( ',' init= INITPARTNER )? ')'
            {
            ID293=(Token)match(input,ID,FOLLOW_ID_in_partner_link4338);  
            stream_ID.add(ID293);

            char_literal294=(Token)match(input,135,FOLLOW_135_in_partner_link4340);  
            stream_135.add(char_literal294);

            char_literal295=(Token)match(input,117,FOLLOW_117_in_partner_link4342);  
            stream_117.add(char_literal295);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:21: (plType= ns_id )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==ID) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:21: plType= ns_id
                    {
                    pushFollow(FOLLOW_ns_id_in_partner_link4346);
                    plType=ns_id();

                    state._fsp--;

                    stream_ns_id.add(plType.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:29: ( ',' roleA= ns_id )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==113) ) {
                int LA121_1 = input.LA(2);

                if ( (LA121_1==ID) ) {
                    alt121=1;
                }
            }
            switch (alt121) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:30: ',' roleA= ns_id
                    {
                    char_literal296=(Token)match(input,113,FOLLOW_113_in_partner_link4350);  
                    stream_113.add(char_literal296);

                    pushFollow(FOLLOW_ns_id_in_partner_link4354);
                    roleA=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleA.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:48: ( ',' roleB= ns_id )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==113) ) {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==ID) ) {
                    alt122=1;
                }
            }
            switch (alt122) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:49: ',' roleB= ns_id
                    {
                    char_literal297=(Token)match(input,113,FOLLOW_113_in_partner_link4359);  
                    stream_113.add(char_literal297);

                    pushFollow(FOLLOW_ns_id_in_partner_link4363);
                    roleB=ns_id();

                    state._fsp--;

                    stream_ns_id.add(roleB.getTree());

                    }
                    break;

            }

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:67: ( ',' init= INITPARTNER )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==113) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:383:68: ',' init= INITPARTNER
                    {
                    char_literal298=(Token)match(input,113,FOLLOW_113_in_partner_link4368);  
                    stream_113.add(char_literal298);

                    init=(Token)match(input,INITPARTNER,FOLLOW_INITPARTNER_in_partner_link4372);  
                    stream_INITPARTNER.add(init);


                    }
                    break;

            }

            char_literal299=(Token)match(input,118,FOLLOW_118_in_partner_link4376);  
            stream_118.add(char_literal299);



            // AST REWRITE
            // elements: roleB, roleA, ID, plType, init
            // token labels: init
            // rule labels: retval, roleA, roleB, plType
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_init=new RewriteRuleTokenStream(adaptor,"token init",init);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_roleA=new RewriteRuleSubtreeStream(adaptor,"rule roleA",roleA!=null?roleA.tree:null);
            RewriteRuleSubtreeStream stream_roleB=new RewriteRuleSubtreeStream(adaptor,"rule roleB",roleB!=null?roleB.tree:null);
            RewriteRuleSubtreeStream stream_plType=new RewriteRuleSubtreeStream(adaptor,"rule plType",plType!=null?plType.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 384:3: -> ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:7: ^( PID ID ( $plType)? ( $roleA)? ( $roleB)? ( $init)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PID, "PID"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:16: ( $plType)?
                if ( stream_plType.hasNext() ) {
                    adaptor.addChild(root_1, stream_plType.nextTree());

                }
                stream_plType.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:25: ( $roleA)?
                if ( stream_roleA.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleA.nextTree());

                }
                stream_roleA.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:33: ( $roleB)?
                if ( stream_roleB.hasNext() ) {
                    adaptor.addChild(root_1, stream_roleB.nextTree());

                }
                stream_roleB.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:384:41: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextNode());

                }
                stream_init.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "partner_link"

    public static class correlation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "correlation"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:386:1: correlation : '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) ;
    public final BPELscriptParser.correlation_return correlation() throws RecognitionException {
        BPELscriptParser.correlation_return retval = new BPELscriptParser.correlation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal300=null;
        Token char_literal302=null;
        Token char_literal304=null;
        BPELscriptParser.corr_mapping_return corr_mapping301 = null;

        BPELscriptParser.corr_mapping_return corr_mapping303 = null;


        CommonTree char_literal300_tree=null;
        CommonTree char_literal302_tree=null;
        CommonTree char_literal304_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_corr_mapping=new RewriteRuleSubtreeStream(adaptor,"rule corr_mapping");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:2: ( '{' corr_mapping ( ',' corr_mapping )* '}' -> ^( CORRELATION ( corr_mapping )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:4: '{' corr_mapping ( ',' corr_mapping )* '}'
            {
            char_literal300=(Token)match(input,110,FOLLOW_110_in_correlation4412);  
            stream_110.add(char_literal300);

            pushFollow(FOLLOW_corr_mapping_in_correlation4414);
            corr_mapping301=corr_mapping();

            state._fsp--;

            stream_corr_mapping.add(corr_mapping301.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:21: ( ',' corr_mapping )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==113) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:22: ',' corr_mapping
            	    {
            	    char_literal302=(Token)match(input,113,FOLLOW_113_in_correlation4417);  
            	    stream_113.add(char_literal302);

            	    pushFollow(FOLLOW_corr_mapping_in_correlation4419);
            	    corr_mapping303=corr_mapping();

            	    state._fsp--;

            	    stream_corr_mapping.add(corr_mapping303.getTree());

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            char_literal304=(Token)match(input,111,FOLLOW_111_in_correlation4423);  
            stream_111.add(char_literal304);



            // AST REWRITE
            // elements: corr_mapping
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 387:45: -> ^( CORRELATION ( corr_mapping )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:387:48: ^( CORRELATION ( corr_mapping )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORRELATION, "CORRELATION"), root_1);

                if ( !(stream_corr_mapping.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_corr_mapping.hasNext() ) {
                    adaptor.addChild(root_1, stream_corr_mapping.nextTree());

                }
                stream_corr_mapping.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "correlation"

    public static class corr_mapping_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "corr_mapping"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:389:1: corr_mapping : ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )* f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) ;
    public final BPELscriptParser.corr_mapping_return corr_mapping() throws RecognitionException {
        BPELscriptParser.corr_mapping_return retval = new BPELscriptParser.corr_mapping_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token init=null;
        Token pattern=null;
        Token f1=null;

        CommonTree init_tree=null;
        CommonTree pattern_tree=null;
        CommonTree f1_tree=null;
        RewriteRuleTokenStream stream_PATTERN_COR=new RewriteRuleTokenStream(adaptor,"token PATTERN_COR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INIT_COR=new RewriteRuleTokenStream(adaptor,"token INIT_COR");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:390:2: ( ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )* f1= ID -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:390:4: ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )* f1= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:390:4: ({...}?init= INIT_COR | {...}?pattern= PATTERN_COR )*
            loop125:
            do {
                int alt125=3;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==INIT_COR) ) {
                    alt125=1;
                }
                else if ( (LA125_0==PATTERN_COR) ) {
                    alt125=2;
                }


                switch (alt125) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:390:6: {...}?init= INIT_COR
            	    {
            	    if ( !((init==null)) ) {
            	        throw new FailedPredicateException(input, "corr_mapping", "init==null");
            	    }
            	    init=(Token)match(input,INIT_COR,FOLLOW_INIT_COR_in_corr_mapping4447);  
            	    stream_INIT_COR.add(init);


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:390:36: {...}?pattern= PATTERN_COR
            	    {
            	    if ( !((pattern==null)) ) {
            	        throw new FailedPredicateException(input, "corr_mapping", "pattern==null");
            	    }
            	    pattern=(Token)match(input,PATTERN_COR,FOLLOW_PATTERN_COR_in_corr_mapping4455);  
            	    stream_PATTERN_COR.add(pattern);


            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);

            f1=(Token)match(input,ID,FOLLOW_ID_in_corr_mapping4464);  
            stream_ID.add(f1);



            // AST REWRITE
            // elements: pattern, f1, init
            // token labels: pattern, init, f1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_pattern=new RewriteRuleTokenStream(adaptor,"token pattern",pattern);
            RewriteRuleTokenStream stream_init=new RewriteRuleTokenStream(adaptor,"token init",init);
            RewriteRuleTokenStream stream_f1=new RewriteRuleTokenStream(adaptor,"token f1",f1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 392:2: -> ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:6: ^( CORR_MAP $f1 ( $init)? ( $pattern)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORR_MAP, "CORR_MAP"), root_1);

                adaptor.addChild(root_1, stream_f1.nextNode());
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:21: ( $init)?
                if ( stream_init.hasNext() ) {
                    adaptor.addChild(root_1, stream_init.nextNode());

                }
                stream_init.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:392:28: ( $pattern)?
                if ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextNode());

                }
                stream_pattern.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_mapping"

    public static class corr_sets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "corr_sets"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:1: corr_sets : 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) ;
    public final BPELscriptParser.corr_sets_return corr_sets() throws RecognitionException {
        BPELscriptParser.corr_sets_return retval = new BPELscriptParser.corr_sets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal305=null;
        Token char_literal306=null;
        Token char_literal307=null;
        Token char_literal308=null;
        Token char_literal309=null;
        List list_cs=null;
        BPELscriptParser.corr_set_return cs = null;
         cs = null;
        CommonTree string_literal305_tree=null;
        CommonTree char_literal306_tree=null;
        CommonTree char_literal307_tree=null;
        CommonTree char_literal308_tree=null;
        CommonTree char_literal309_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_169=new RewriteRuleTokenStream(adaptor,"token 169");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_corr_set=new RewriteRuleSubtreeStream(adaptor,"rule corr_set");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:12: ( 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}' -> ^( CORRSETS ( $cs)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:14: 'correlates' '{' cs+= corr_set ';' (cs+= corr_set ';' )* '}'
            {
            string_literal305=(Token)match(input,169,FOLLOW_169_in_corr_sets4499);  
            stream_169.add(string_literal305);

            char_literal306=(Token)match(input,110,FOLLOW_110_in_corr_sets4501);  
            stream_110.add(char_literal306);

            pushFollow(FOLLOW_corr_set_in_corr_sets4504);
            cs=corr_set();

            state._fsp--;

            stream_corr_set.add(cs.getTree());
            if (list_cs==null) list_cs=new ArrayList();
            list_cs.add(cs.getTree());

            char_literal307=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets4506);  
            stream_SEMI.add(char_literal307);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:47: (cs+= corr_set ';' )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==ID) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:48: cs+= corr_set ';'
            	    {
            	    pushFollow(FOLLOW_corr_set_in_corr_sets4511);
            	    cs=corr_set();

            	    state._fsp--;

            	    stream_corr_set.add(cs.getTree());
            	    if (list_cs==null) list_cs=new ArrayList();
            	    list_cs.add(cs.getTree());

            	    char_literal308=(Token)match(input,SEMI,FOLLOW_SEMI_in_corr_sets4513);  
            	    stream_SEMI.add(char_literal308);


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            char_literal309=(Token)match(input,111,FOLLOW_111_in_corr_sets4517);  
            stream_111.add(char_literal309);



            // AST REWRITE
            // elements: cs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: cs
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_cs=new RewriteRuleSubtreeStream(adaptor,"token cs",list_cs);
            root_0 = (CommonTree)adaptor.nil();
            // 395:71: -> ^( CORRSETS ( $cs)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:395:74: ^( CORRSETS ( $cs)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORRSETS, "CORRSETS"), root_1);

                if ( !(stream_cs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_cs.hasNext() ) {
                    adaptor.addChild(root_1, stream_cs.nextTree());

                }
                stream_cs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_sets"

    public static class corr_set_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "corr_set"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:1: corr_set : f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) ;
    public final BPELscriptParser.corr_set_return corr_set() throws RecognitionException {
        BPELscriptParser.corr_set_return retval = new BPELscriptParser.corr_set_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token f=null;
        Token char_literal310=null;
        Token char_literal311=null;
        Token char_literal312=null;
        Token par=null;
        List list_par=null;

        CommonTree f_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree char_literal311_tree=null;
        CommonTree char_literal312_tree=null;
        CommonTree par_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:10: (f= ID '(' par+= ID ( ',' par+= ID )* ')' -> ^( CORRSET $f ( $par)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:12: f= ID '(' par+= ID ( ',' par+= ID )* ')'
            {
            f=(Token)match(input,ID,FOLLOW_ID_in_corr_set4537);  
            stream_ID.add(f);

            char_literal310=(Token)match(input,117,FOLLOW_117_in_corr_set4539);  
            stream_117.add(char_literal310);

            par=(Token)match(input,ID,FOLLOW_ID_in_corr_set4543);  
            stream_ID.add(par);

            if (list_par==null) list_par=new ArrayList();
            list_par.add(par);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:29: ( ',' par+= ID )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==113) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:30: ',' par+= ID
            	    {
            	    char_literal311=(Token)match(input,113,FOLLOW_113_in_corr_set4546);  
            	    stream_113.add(char_literal311);

            	    par=(Token)match(input,ID,FOLLOW_ID_in_corr_set4550);  
            	    stream_ID.add(par);

            	    if (list_par==null) list_par=new ArrayList();
            	    list_par.add(par);


            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);

            char_literal312=(Token)match(input,118,FOLLOW_118_in_corr_set4554);  
            stream_118.add(char_literal312);



            // AST REWRITE
            // elements: f, par
            // token labels: f
            // rule labels: retval
            // token list labels: par
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
            RewriteRuleTokenStream stream_par=new RewriteRuleTokenStream(adaptor,"token par", list_par);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 397:48: -> ^( CORRSET $f ( $par)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:397:51: ^( CORRSET $f ( $par)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CORRSET, "CORRSET"), root_1);

                adaptor.addChild(root_1, stream_f.nextNode());
                if ( !(stream_par.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_par.hasNext() ) {
                    adaptor.addChild(root_1, stream_par.nextNode());

                }
                stream_par.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "corr_set"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:1: expr : ( s_expr | EXT_EXPR | funct_call );
    public final BPELscriptParser.expr_return expr() throws RecognitionException {
        BPELscriptParser.expr_return retval = new BPELscriptParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXT_EXPR314=null;
        BPELscriptParser.s_expr_return s_expr313 = null;

        BPELscriptParser.funct_call_return funct_call315 = null;


        CommonTree EXT_EXPR314_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:7: ( s_expr | EXT_EXPR | funct_call )
            int alt128=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==SEMI||LA128_1==PROP||LA128_1==118||(LA128_1>=136 && LA128_1<=137)||LA128_1==164||(LA128_1>=170 && LA128_1<=180)) ) {
                    alt128=1;
                }
                else if ( (LA128_1==117) ) {
                    alt128=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 128, 1, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
            case INT:
            case 117:
                {
                alt128=1;
                }
                break;
            case EXT_EXPR:
                {
                alt128=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:9: s_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_s_expr_in_expr4577);
                    s_expr313=s_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, s_expr313.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:18: EXT_EXPR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EXT_EXPR314=(Token)match(input,EXT_EXPR,FOLLOW_EXT_EXPR_in_expr4581); 
                    EXT_EXPR314_tree = (CommonTree)adaptor.create(EXT_EXPR314);
                    adaptor.addChild(root_0, EXT_EXPR314_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:400:29: funct_call
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_funct_call_in_expr4585);
                    funct_call315=funct_call();

                    state._fsp--;

                    adaptor.addChild(root_0, funct_call315.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class funct_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funct_call"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:1: funct_call : p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) ;
    public final BPELscriptParser.funct_call_return funct_call() throws RecognitionException {
        BPELscriptParser.funct_call_return retval = new BPELscriptParser.funct_call_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal316=null;
        Token char_literal317=null;
        Token p=null;
        List list_p=null;

        CommonTree char_literal316_tree=null;
        CommonTree char_literal317_tree=null;
        CommonTree p_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:12: (p+= ID '(' (p+= ID )* ')' -> ^( CALL ( ID )+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:14: p+= ID '(' (p+= ID )* ')'
            {
            p=(Token)match(input,ID,FOLLOW_ID_in_funct_call4594);  
            stream_ID.add(p);

            if (list_p==null) list_p=new ArrayList();
            list_p.add(p);

            char_literal316=(Token)match(input,117,FOLLOW_117_in_funct_call4596);  
            stream_117.add(char_literal316);

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:25: (p+= ID )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==ID) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:25: p+= ID
            	    {
            	    p=(Token)match(input,ID,FOLLOW_ID_in_funct_call4600);  
            	    stream_ID.add(p);

            	    if (list_p==null) list_p=new ArrayList();
            	    list_p.add(p);


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            char_literal317=(Token)match(input,118,FOLLOW_118_in_funct_call4603);  
            stream_118.add(char_literal317);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 401:35: -> ^( CALL ( ID )+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:401:38: ^( CALL ( ID )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "funct_call"

    public static class s_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "s_expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:402:1: s_expr : condExpr ;
    public final BPELscriptParser.s_expr_return s_expr() throws RecognitionException {
        BPELscriptParser.s_expr_return retval = new BPELscriptParser.s_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        BPELscriptParser.condExpr_return condExpr318 = null;



        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:402:9: ( condExpr )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:402:11: condExpr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_s_expr4620);
            condExpr318=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr318.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "s_expr"

    public static class condExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:1: condExpr : aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? ;
    public final BPELscriptParser.condExpr_return condExpr() throws RecognitionException {
        BPELscriptParser.condExpr_return retval = new BPELscriptParser.condExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal320=null;
        Token string_literal321=null;
        Token char_literal322=null;
        Token char_literal323=null;
        Token string_literal324=null;
        Token string_literal325=null;
        BPELscriptParser.aexpr_return aexpr319 = null;

        BPELscriptParser.aexpr_return aexpr326 = null;


        CommonTree string_literal320_tree=null;
        CommonTree string_literal321_tree=null;
        CommonTree char_literal322_tree=null;
        CommonTree char_literal323_tree=null;
        CommonTree string_literal324_tree=null;
        CommonTree string_literal325_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:11: ( aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )? )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:13: aexpr ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpr4628);
            aexpr319=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, aexpr319.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:19: ( ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( ((LA131_0>=170 && LA131_0<=175)) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' ) aexpr
                    {
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:21: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
                    int alt130=6;
                    switch ( input.LA(1) ) {
                    case 170:
                        {
                        alt130=1;
                        }
                        break;
                    case 171:
                        {
                        alt130=2;
                        }
                        break;
                    case 172:
                        {
                        alt130=3;
                        }
                        break;
                    case 173:
                        {
                        alt130=4;
                        }
                        break;
                    case 174:
                        {
                        alt130=5;
                        }
                        break;
                    case 175:
                        {
                        alt130=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }

                    switch (alt130) {
                        case 1 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:22: '=='
                            {
                            string_literal320=(Token)match(input,170,FOLLOW_170_in_condExpr4633); 
                            string_literal320_tree = (CommonTree)adaptor.create(string_literal320);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal320_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:29: '!='
                            {
                            string_literal321=(Token)match(input,171,FOLLOW_171_in_condExpr4637); 
                            string_literal321_tree = (CommonTree)adaptor.create(string_literal321);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal321_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:36: '<'
                            {
                            char_literal322=(Token)match(input,172,FOLLOW_172_in_condExpr4641); 
                            char_literal322_tree = (CommonTree)adaptor.create(char_literal322);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal322_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:42: '>'
                            {
                            char_literal323=(Token)match(input,173,FOLLOW_173_in_condExpr4645); 
                            char_literal323_tree = (CommonTree)adaptor.create(char_literal323);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal323_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:48: '<='
                            {
                            string_literal324=(Token)match(input,174,FOLLOW_174_in_condExpr4649); 
                            string_literal324_tree = (CommonTree)adaptor.create(string_literal324);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal324_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:403:55: '>='
                            {
                            string_literal325=(Token)match(input,175,FOLLOW_175_in_condExpr4653); 
                            string_literal325_tree = (CommonTree)adaptor.create(string_literal325);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal325_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_aexpr_in_condExpr4658);
                    aexpr326=aexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, aexpr326.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aexpr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:404:1: aexpr : mexpr ( ( '+' | '-' ) mexpr )* ;
    public final BPELscriptParser.aexpr_return aexpr() throws RecognitionException {
        BPELscriptParser.aexpr_return retval = new BPELscriptParser.aexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set328=null;
        BPELscriptParser.mexpr_return mexpr327 = null;

        BPELscriptParser.mexpr_return mexpr329 = null;


        CommonTree set328_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:404:8: ( mexpr ( ( '+' | '-' ) mexpr )* )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:404:10: mexpr ( ( '+' | '-' ) mexpr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr4669);
            mexpr327=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, mexpr327.getTree());
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:404:16: ( ( '+' | '-' ) mexpr )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( ((LA132_0>=176 && LA132_0<=177)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:404:17: ( '+' | '-' ) mexpr
            	    {
            	    set328=(Token)input.LT(1);
            	    set328=(Token)input.LT(1);
            	    if ( (input.LA(1)>=176 && input.LA(1)<=177) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set328), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr4680);
            	    mexpr329=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mexpr329.getTree());

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class mexpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mexpr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:1: mexpr : ( atom ( ( '*' | '/' ) atom )* | STRING );
    public final BPELscriptParser.mexpr_return mexpr() throws RecognitionException {
        BPELscriptParser.mexpr_return retval = new BPELscriptParser.mexpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set331=null;
        Token STRING333=null;
        BPELscriptParser.atom_return atom330 = null;

        BPELscriptParser.atom_return atom332 = null;


        CommonTree set331_tree=null;
        CommonTree STRING333_tree=null;

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:8: ( atom ( ( '*' | '/' ) atom )* | STRING )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==ID||LA134_0==INT||LA134_0==117) ) {
                alt134=1;
            }
            else if ( (LA134_0==STRING) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:10: atom ( ( '*' | '/' ) atom )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_mexpr4690);
                    atom330=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom330.getTree());
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:15: ( ( '*' | '/' ) atom )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( ((LA133_0>=178 && LA133_0<=179)) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:16: ( '*' | '/' ) atom
                    	    {
                    	    set331=(Token)input.LT(1);
                    	    set331=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=178 && input.LA(1)<=179) ) {
                    	        input.consume();
                    	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set331), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_atom_in_mexpr4701);
                    	    atom332=atom();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, atom332.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:405:37: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STRING333=(Token)match(input,STRING,FOLLOW_STRING_in_mexpr4707); 
                    STRING333_tree = (CommonTree)adaptor.create(STRING333);
                    adaptor.addChild(root_0, STRING333_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mexpr"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:1: atom : ( path_expr | INT | '(' s_expr ')' -> s_expr );
    public final BPELscriptParser.atom_return atom() throws RecognitionException {
        BPELscriptParser.atom_return retval = new BPELscriptParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT335=null;
        Token char_literal336=null;
        Token char_literal338=null;
        BPELscriptParser.path_expr_return path_expr334 = null;

        BPELscriptParser.s_expr_return s_expr337 = null;


        CommonTree INT335_tree=null;
        CommonTree char_literal336_tree=null;
        CommonTree char_literal338_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_s_expr=new RewriteRuleSubtreeStream(adaptor,"rule s_expr");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:7: ( path_expr | INT | '(' s_expr ')' -> s_expr )
            int alt135=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt135=1;
                }
                break;
            case INT:
                {
                alt135=2;
                }
                break;
            case 117:
                {
                alt135=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:9: path_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_path_expr_in_atom4715);
                    path_expr334=path_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, path_expr334.getTree());

                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:21: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INT335=(Token)match(input,INT,FOLLOW_INT_in_atom4719); 
                    INT335_tree = (CommonTree)adaptor.create(INT335);
                    adaptor.addChild(root_0, INT335_tree);


                    }
                    break;
                case 3 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:406:27: '(' s_expr ')'
                    {
                    char_literal336=(Token)match(input,117,FOLLOW_117_in_atom4723);  
                    stream_117.add(char_literal336);

                    pushFollow(FOLLOW_s_expr_in_atom4725);
                    s_expr337=s_expr();

                    state._fsp--;

                    stream_s_expr.add(s_expr337.getTree());
                    char_literal338=(Token)match(input,118,FOLLOW_118_in_atom4727);  
                    stream_118.add(char_literal338);



                    // AST REWRITE
                    // elements: s_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 406:42: -> s_expr
                    {
                        adaptor.addChild(root_0, stream_s_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class path_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "path_expr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:1: path_expr : pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) ;
    public final BPELscriptParser.path_expr_return path_expr() throws RecognitionException {
        BPELscriptParser.path_expr_return retval = new BPELscriptParser.path_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal339=null;
        List list_pelmt=null;
        BPELscriptParser.ns_id_return pelmt = null;
         pelmt = null;
        CommonTree char_literal339_tree=null;
        RewriteRuleTokenStream stream_180=new RewriteRuleTokenStream(adaptor,"token 180");
        RewriteRuleSubtreeStream stream_ns_id=new RewriteRuleSubtreeStream(adaptor,"rule ns_id");
        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:11: (pelmt+= ns_id ( '.' pelmt+= ns_id )* -> ^( PATH ( $pelmt)+ ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:13: pelmt+= ns_id ( '.' pelmt+= ns_id )*
            {
            pushFollow(FOLLOW_ns_id_in_path_expr4740);
            pelmt=ns_id();

            state._fsp--;

            stream_ns_id.add(pelmt.getTree());
            if (list_pelmt==null) list_pelmt=new ArrayList();
            list_pelmt.add(pelmt.getTree());

            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:26: ( '.' pelmt+= ns_id )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==180) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:27: '.' pelmt+= ns_id
            	    {
            	    char_literal339=(Token)match(input,180,FOLLOW_180_in_path_expr4743);  
            	    stream_180.add(char_literal339);

            	    pushFollow(FOLLOW_ns_id_in_path_expr4747);
            	    pelmt=ns_id();

            	    state._fsp--;

            	    stream_ns_id.add(pelmt.getTree());
            	    if (list_pelmt==null) list_pelmt=new ArrayList();
            	    list_pelmt.add(pelmt.getTree());


            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);



            // AST REWRITE
            // elements: pelmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: pelmt
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_pelmt=new RewriteRuleSubtreeStream(adaptor,"token pelmt",list_pelmt);
            root_0 = (CommonTree)adaptor.nil();
            // 407:46: -> ^( PATH ( $pelmt)+ )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:407:49: ^( PATH ( $pelmt)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PATH, "PATH"), root_1);

                if ( !(stream_pelmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pelmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_pelmt.nextTree());

                }
                stream_pelmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "path_expr"

    public static class ns_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ns_id"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:1: ns_id : (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) ;
    public final BPELscriptParser.ns_id_return ns_id() throws RecognitionException {
        BPELscriptParser.ns_id_return retval = new BPELscriptParser.ns_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token pr=null;
        Token loc=null;
        Token string_literal340=null;

        CommonTree pr_tree=null;
        CommonTree loc_tree=null;
        CommonTree string_literal340_tree=null;
        RewriteRuleTokenStream stream_164=new RewriteRuleTokenStream(adaptor,"token 164");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:8: ( (pr= ID '::' )? loc= ID -> ^( NS ( $pr)? $loc) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:10: (pr= ID '::' )? loc= ID
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:10: (pr= ID '::' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==ID) ) {
                int LA137_1 = input.LA(2);

                if ( (LA137_1==164) ) {
                    alt137=1;
                }
            }
            switch (alt137) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:11: pr= ID '::'
                    {
                    pr=(Token)match(input,ID,FOLLOW_ID_in_ns_id4770);  
                    stream_ID.add(pr);

                    string_literal340=(Token)match(input,164,FOLLOW_164_in_ns_id4772);  
                    stream_164.add(string_literal340);


                    }
                    break;

            }

            loc=(Token)match(input,ID,FOLLOW_ID_in_ns_id4778);  
            stream_ID.add(loc);



            // AST REWRITE
            // elements: pr, loc
            // token labels: loc, pr
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_loc=new RewriteRuleTokenStream(adaptor,"token loc",loc);
            RewriteRuleTokenStream stream_pr=new RewriteRuleTokenStream(adaptor,"token pr",pr);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 408:31: -> ^( NS ( $pr)? $loc)
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:34: ^( NS ( $pr)? $loc)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NS, "NS"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:408:39: ( $pr)?
                if ( stream_pr.hasNext() ) {
                    adaptor.addChild(root_1, stream_pr.nextNode());

                }
                stream_pr.reset();
                adaptor.addChild(root_1, stream_loc.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ns_id"

    public static class portType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "portType"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:412:1: portType : ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) ;
    public final BPELscriptParser.portType_return portType() throws RecognitionException {
        BPELscriptParser.portType_return retval = new BPELscriptParser.portType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal341=null;
        Token string_literal342=null;
        Token STRING343=null;

        CommonTree string_literal341_tree=null;
        CommonTree string_literal342_tree=null;
        CommonTree STRING343_tree=null;
        RewriteRuleTokenStream stream_181=new RewriteRuleTokenStream(adaptor,"token 181");
        RewriteRuleTokenStream stream_182=new RewriteRuleTokenStream(adaptor,"token 182");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:412:11: ( ( '@portType' | '@pt' ) STRING -> ^( PORTTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:412:13: ( '@portType' | '@pt' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:412:13: ( '@portType' | '@pt' )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==181) ) {
                alt138=1;
            }
            else if ( (LA138_0==182) ) {
                alt138=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:412:14: '@portType'
                    {
                    string_literal341=(Token)match(input,181,FOLLOW_181_in_portType4803);  
                    stream_181.add(string_literal341);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:412:28: '@pt'
                    {
                    string_literal342=(Token)match(input,182,FOLLOW_182_in_portType4807);  
                    stream_182.add(string_literal342);


                    }
                    break;

            }

            STRING343=(Token)match(input,STRING,FOLLOW_STRING_in_portType4810);  
            stream_STRING.add(STRING343);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 413:3: -> ^( PORTTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:413:6: ^( PORTTYPE STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PORTTYPE, "PORTTYPE"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "portType"

    public static class std_attr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "std_attr"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:1: std_attr : ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) ;
    public final BPELscriptParser.std_attr_return std_attr() throws RecognitionException {
        BPELscriptParser.std_attr_return retval = new BPELscriptParser.std_attr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token suppressJoinFailure=null;
        Token string_literal344=null;

        CommonTree name_tree=null;
        CommonTree suppressJoinFailure_tree=null;
        CommonTree string_literal344_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_SJF=new RewriteRuleTokenStream(adaptor,"token SJF");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:10: ( ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )* -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:12: ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:12: ({...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*
            loop139:
            do {
                int alt139=3;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==114) ) {
                    int LA139_2 = input.LA(2);

                    if ( ((name==null)) ) {
                        alt139=1;
                    }


                }
                else if ( (LA139_0==SJF) ) {
                    int LA139_3 = input.LA(2);

                    if ( ((suppressJoinFailure==null)) ) {
                        alt139=2;
                    }


                }


                switch (alt139) {
            	case 1 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:14: {...}? ( '@name' name= STRING )
            	    {
            	    if ( !((name==null)) ) {
            	        throw new FailedPredicateException(input, "std_attr", "name==null");
            	    }
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:28: ( '@name' name= STRING )
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:29: '@name' name= STRING
            	    {
            	    string_literal344=(Token)match(input,114,FOLLOW_114_in_std_attr4834);  
            	    stream_114.add(string_literal344);

            	    name=(Token)match(input,STRING,FOLLOW_STRING_in_std_attr4838);  
            	    stream_STRING.add(name);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:415:52: {...}?suppressJoinFailure= SJF
            	    {
            	    if ( !((suppressJoinFailure==null)) ) {
            	        throw new FailedPredicateException(input, "std_attr", "suppressJoinFailure==null");
            	    }
            	    suppressJoinFailure=(Token)match(input,SJF,FOLLOW_SJF_in_std_attr4847);  
            	    stream_SJF.add(suppressJoinFailure);


            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);



            // AST REWRITE
            // elements: suppressJoinFailure, name
            // token labels: suppressJoinFailure, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_suppressJoinFailure=new RewriteRuleTokenStream(adaptor,"token suppressJoinFailure",suppressJoinFailure);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 416:3: -> ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:416:6: ^( STD_ATTR ( $name)? ( $suppressJoinFailure)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STD_ATTR, "STD_ATTR"), root_1);

                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:416:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:416:24: ( $suppressJoinFailure)?
                if ( stream_suppressJoinFailure.hasNext() ) {
                    adaptor.addChild(root_1, stream_suppressJoinFailure.nextNode());

                }
                stream_suppressJoinFailure.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException exc) {
            	reportFailedPredicateWarning(exc);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "std_attr"

    public static class msgEx_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "msgEx"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:420:1: msgEx : ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) ;
    public final BPELscriptParser.msgEx_return msgEx() throws RecognitionException {
        BPELscriptParser.msgEx_return retval = new BPELscriptParser.msgEx_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal345=null;
        Token string_literal346=null;
        Token STRING347=null;

        CommonTree string_literal345_tree=null;
        CommonTree string_literal346_tree=null;
        CommonTree STRING347_tree=null;
        RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
        RewriteRuleTokenStream stream_184=new RewriteRuleTokenStream(adaptor,"token 184");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:420:8: ( ( '@messageExchange' | '@mex' ) STRING -> ^( MSGEX STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:420:10: ( '@messageExchange' | '@mex' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:420:10: ( '@messageExchange' | '@mex' )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==183) ) {
                alt140=1;
            }
            else if ( (LA140_0==184) ) {
                alt140=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:420:11: '@messageExchange'
                    {
                    string_literal345=(Token)match(input,183,FOLLOW_183_in_msgEx4886);  
                    stream_183.add(string_literal345);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:420:32: '@mex'
                    {
                    string_literal346=(Token)match(input,184,FOLLOW_184_in_msgEx4890);  
                    stream_184.add(string_literal346);


                    }
                    break;

            }

            STRING347=(Token)match(input,STRING,FOLLOW_STRING_in_msgEx4893);  
            stream_STRING.add(STRING347);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 421:3: -> ^( MSGEX STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:421:6: ^( MSGEX STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSGEX, "MSGEX"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgEx"

    public static class msgType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "msgType"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:1: msgType : ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) ;
    public final BPELscriptParser.msgType_return msgType() throws RecognitionException {
        BPELscriptParser.msgType_return retval = new BPELscriptParser.msgType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token msgT=null;
        Token string_literal348=null;
        Token string_literal349=null;

        CommonTree msgT_tree=null;
        CommonTree string_literal348_tree=null;
        CommonTree string_literal349_tree=null;
        RewriteRuleTokenStream stream_185=new RewriteRuleTokenStream(adaptor,"token 185");
        RewriteRuleTokenStream stream_186=new RewriteRuleTokenStream(adaptor,"token 186");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:10: ( ( '@messageType' | '@msgType' ) msgT= STRING -> ^( MSGTYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:12: ( '@messageType' | '@msgType' ) msgT= STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:12: ( '@messageType' | '@msgType' )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==185) ) {
                alt141=1;
            }
            else if ( (LA141_0==186) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:13: '@messageType'
                    {
                    string_literal348=(Token)match(input,185,FOLLOW_185_in_msgType4913);  
                    stream_185.add(string_literal348);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:423:30: '@msgType'
                    {
                    string_literal349=(Token)match(input,186,FOLLOW_186_in_msgType4917);  
                    stream_186.add(string_literal349);


                    }
                    break;

            }

            msgT=(Token)match(input,STRING,FOLLOW_STRING_in_msgType4922);  
            stream_STRING.add(msgT);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 424:3: -> ^( MSGTYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:424:6: ^( MSGTYPE STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MSGTYPE, "MSGTYPE"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "msgType"

    public static class viType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "viType"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:427:1: viType : '@type' type= STRING -> ^( VITYPE STRING ) ;
    public final BPELscriptParser.viType_return viType() throws RecognitionException {
        BPELscriptParser.viType_return retval = new BPELscriptParser.viType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token type=null;
        Token string_literal350=null;

        CommonTree type_tree=null;
        CommonTree string_literal350_tree=null;
        RewriteRuleTokenStream stream_187=new RewriteRuleTokenStream(adaptor,"token 187");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:427:9: ( '@type' type= STRING -> ^( VITYPE STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:427:11: '@type' type= STRING
            {
            string_literal350=(Token)match(input,187,FOLLOW_187_in_viType4942);  
            stream_187.add(string_literal350);

            type=(Token)match(input,STRING,FOLLOW_STRING_in_viType4946);  
            stream_STRING.add(type);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 428:3: -> ^( VITYPE STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:428:6: ^( VITYPE STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VITYPE, "VITYPE"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "viType"

    public static class viElt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "viElt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:430:1: viElt : '@element' elt= STRING -> ^( VIELT STRING ) ;
    public final BPELscriptParser.viElt_return viElt() throws RecognitionException {
        BPELscriptParser.viElt_return retval = new BPELscriptParser.viElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token elt=null;
        Token string_literal351=null;

        CommonTree elt_tree=null;
        CommonTree string_literal351_tree=null;
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:430:8: ( '@element' elt= STRING -> ^( VIELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:430:10: '@element' elt= STRING
            {
            string_literal351=(Token)match(input,188,FOLLOW_188_in_viElt4966);  
            stream_188.add(string_literal351);

            elt=(Token)match(input,STRING,FOLLOW_STRING_in_viElt4970);  
            stream_STRING.add(elt);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 431:3: -> ^( VIELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:431:6: ^( VIELT STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VIELT, "VIELT"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "viElt"

    public static class faultName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "faultName"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:433:1: faultName : ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) ;
    public final BPELscriptParser.faultName_return faultName() throws RecognitionException {
        BPELscriptParser.faultName_return retval = new BPELscriptParser.faultName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal352=null;
        Token string_literal353=null;
        Token STRING354=null;

        CommonTree string_literal352_tree=null;
        CommonTree string_literal353_tree=null;
        CommonTree STRING354_tree=null;
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_190=new RewriteRuleTokenStream(adaptor,"token 190");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:433:11: ( ( '@faultName' | '@fault' ) STRING -> ^( FAULTNAME STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:433:13: ( '@faultName' | '@fault' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:433:13: ( '@faultName' | '@fault' )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==189) ) {
                alt142=1;
            }
            else if ( (LA142_0==190) ) {
                alt142=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:433:14: '@faultName'
                    {
                    string_literal352=(Token)match(input,189,FOLLOW_189_in_faultName4989);  
                    stream_189.add(string_literal352);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:433:29: '@fault'
                    {
                    string_literal353=(Token)match(input,190,FOLLOW_190_in_faultName4993);  
                    stream_190.add(string_literal353);


                    }
                    break;

            }

            STRING354=(Token)match(input,STRING,FOLLOW_STRING_in_faultName4996);  
            stream_STRING.add(STRING354);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 434:3: -> ^( FAULTNAME STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:434:6: ^( FAULTNAME STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FAULTNAME, "FAULTNAME"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "faultName"

    public static class faultElt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "faultElt"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:436:1: faultElt : '@faultElement' STRING -> ^( FAULTELT STRING ) ;
    public final BPELscriptParser.faultElt_return faultElt() throws RecognitionException {
        BPELscriptParser.faultElt_return retval = new BPELscriptParser.faultElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal355=null;
        Token STRING356=null;

        CommonTree string_literal355_tree=null;
        CommonTree STRING356_tree=null;
        RewriteRuleTokenStream stream_191=new RewriteRuleTokenStream(adaptor,"token 191");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:436:10: ( '@faultElement' STRING -> ^( FAULTELT STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:436:12: '@faultElement' STRING
            {
            string_literal355=(Token)match(input,191,FOLLOW_191_in_faultElt5014);  
            stream_191.add(string_literal355);

            STRING356=(Token)match(input,STRING,FOLLOW_STRING_in_faultElt5016);  
            stream_STRING.add(STRING356);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 437:3: -> ^( FAULTELT STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:437:6: ^( FAULTELT STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FAULTELT, "FAULTELT"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "faultElt"

    public static class exprLg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprLg"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:1: exprLg : ( '@expressionLanguage' | '@exprLg' ) STRING -> ^( EXPRLG STRING ) ;
    public final BPELscriptParser.exprLg_return exprLg() throws RecognitionException {
        BPELscriptParser.exprLg_return retval = new BPELscriptParser.exprLg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal357=null;
        Token string_literal358=null;
        Token STRING359=null;

        CommonTree string_literal357_tree=null;
        CommonTree string_literal358_tree=null;
        CommonTree STRING359_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_193=new RewriteRuleTokenStream(adaptor,"token 193");
        RewriteRuleTokenStream stream_192=new RewriteRuleTokenStream(adaptor,"token 192");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:9: ( ( '@expressionLanguage' | '@exprLg' ) STRING -> ^( EXPRLG STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:11: ( '@expressionLanguage' | '@exprLg' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:11: ( '@expressionLanguage' | '@exprLg' )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==192) ) {
                alt143=1;
            }
            else if ( (LA143_0==193) ) {
                alt143=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:12: '@expressionLanguage'
                    {
                    string_literal357=(Token)match(input,192,FOLLOW_192_in_exprLg5039);  
                    stream_192.add(string_literal357);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:439:36: '@exprLg'
                    {
                    string_literal358=(Token)match(input,193,FOLLOW_193_in_exprLg5043);  
                    stream_193.add(string_literal358);


                    }
                    break;

            }

            STRING359=(Token)match(input,STRING,FOLLOW_STRING_in_exprLg5046);  
            stream_STRING.add(STRING359);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 440:3: -> ^( EXPRLG STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:440:6: ^( EXPRLG STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRLG, "EXPRLG"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprLg"

    public static class queryLg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "queryLg"
    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:1: queryLg : ( '@queryLanguage' | '@queryLg' ) STRING -> ^( QUERYLG STRING ) ;
    public final BPELscriptParser.queryLg_return queryLg() throws RecognitionException {
        BPELscriptParser.queryLg_return retval = new BPELscriptParser.queryLg_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal360=null;
        Token string_literal361=null;
        Token STRING362=null;

        CommonTree string_literal360_tree=null;
        CommonTree string_literal361_tree=null;
        CommonTree STRING362_tree=null;
        RewriteRuleTokenStream stream_195=new RewriteRuleTokenStream(adaptor,"token 195");
        RewriteRuleTokenStream stream_194=new RewriteRuleTokenStream(adaptor,"token 194");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:9: ( ( '@queryLanguage' | '@queryLg' ) STRING -> ^( QUERYLG STRING ) )
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:11: ( '@queryLanguage' | '@queryLg' ) STRING
            {
            // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:11: ( '@queryLanguage' | '@queryLg' )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==194) ) {
                alt144=1;
            }
            else if ( (LA144_0==195) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:12: '@queryLanguage'
                    {
                    string_literal360=(Token)match(input,194,FOLLOW_194_in_queryLg5067);  
                    stream_194.add(string_literal360);


                    }
                    break;
                case 2 :
                    // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:442:31: '@queryLg'
                    {
                    string_literal361=(Token)match(input,195,FOLLOW_195_in_queryLg5071);  
                    stream_195.add(string_literal361);


                    }
                    break;

            }

            STRING362=(Token)match(input,STRING,FOLLOW_STRING_in_queryLg5074);  
            stream_STRING.add(STRING362);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 443:3: -> ^( QUERYLG STRING )
            {
                // /home/bischomc/bpelscript/src/main/resources/iaas/bpelscript/antlr/BPELscript.g:443:6: ^( QUERYLG STRING )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(QUERYLG, "QUERYLG"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "queryLg"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA107 dfa107 = new DFA107(this);
    static final String DFA11_eotS =
        "\103\uffff";
    static final String DFA11_eofS =
        "\103\uffff";
    static final String DFA11_minS =
        "\1\122\5\127\1\122\2\uffff\1\122\11\uffff\4\122\6\127\1\122\3\127"+
        "\1\122\3\127\3\122\5\127\11\122\1\127\5\122\1\127\2\122\1\127\3"+
        "\122";
    static final String DFA11_maxS =
        "\1\u00c3\5\127\1\u00c3\2\uffff\1\u00be\11\uffff\3\u00c3\1\u00be"+
        "\6\127\1\u00be\3\127\1\u00c3\3\127\2\u00c3\1\u00be\5\127\1\u00be"+
        "\3\u00c3\1\u00be\4\u00c3\1\127\1\u00be\2\u00c3\1\u00be\1\u00c3\1"+
        "\127\1\u00c3\1\u00be\1\127\3\u00c3";
    static final String DFA11_acceptS =
        "\7\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\60\uffff";
    static final String DFA11_specialS =
        "\103\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\6\1\16\1\uffff\1\22\1\11\1\uffff\1\22\2\15\1\16\1\uffff\3"+
            "\22\1\uffff\1\17\20\uffff\1\5\1\12\3\uffff\2\22\1\uffff\1\10"+
            "\5\uffff\1\7\2\uffff\1\13\1\14\1\uffff\1\15\3\uffff\1\20\3\uffff"+
            "\1\16\6\uffff\14\22\4\uffff\4\22\1\21\13\uffff\4\22\4\uffff"+
            "\2\22\1\uffff\1\3\1\4\1\1\1\2",
            "\1\23",
            "\1\23",
            "\1\24",
            "\1\24",
            "\1\25",
            "\1\6\1\16\1\uffff\1\22\1\26\1\uffff\1\22\2\15\1\16\1\uffff"+
            "\3\22\1\uffff\1\17\20\uffff\1\27\1\12\3\uffff\2\22\1\uffff\1"+
            "\10\5\uffff\1\7\2\uffff\1\13\1\14\1\uffff\1\15\7\uffff\1\16"+
            "\6\uffff\14\22\24\uffff\4\22\4\uffff\2\22\1\uffff\1\32\1\33"+
            "\1\30\1\31",
            "",
            "",
            "\1\35\2\uffff\1\22\1\11\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\34\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\37\uffff\1\40\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\36\1\37\1\1\1\2",
            "\1\45\37\uffff\1\44\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\3\1\4\1\42\1\43",
            "\1\46\2\uffff\1\22\1\47\1\uffff\1\22\2\15\2\uffff\3\22\1\uffff"+
            "\1\17\20\uffff\1\5\1\12\3\uffff\2\22\1\uffff\1\10\5\uffff\1"+
            "\7\2\uffff\1\13\1\14\1\uffff\1\15\16\uffff\14\22\24\uffff\4"+
            "\22\4\uffff\2\22\1\uffff\1\52\1\53\1\50\1\51",
            "\1\55\2\uffff\1\22\1\26\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\54\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\56",
            "\1\57",
            "\1\57",
            "\1\60",
            "\1\60",
            "\1\61",
            "\1\35\2\uffff\1\22\1\11\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\34\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\41\37\uffff\1\40\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\36\1\37\1\1\1\2",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\45\37\uffff\1\44\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\3\1\4\1\42\1\43",
            "\1\46\2\uffff\1\22\1\47\1\uffff\1\22\2\15\2\uffff\3\22\1\uffff"+
            "\1\17\20\uffff\1\5\1\12\3\uffff\2\22\1\uffff\1\10\5\uffff\1"+
            "\7\2\uffff\1\13\1\14\1\uffff\1\15\16\uffff\14\22\24\uffff\4"+
            "\22\4\uffff\2\22\1\uffff\1\52\1\53\1\50\1\51",
            "\1\67\2\uffff\1\22\1\47\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\66\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\55\2\uffff\1\22\1\26\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\54\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\73\2\uffff\1\22\1\26\1\uffff\1\22\2\15\2\uffff\3\22\1\uffff"+
            "\1\17\20\uffff\1\27\1\12\3\uffff\2\22\1\uffff\1\10\5\uffff\1"+
            "\7\2\uffff\1\13\1\14\1\uffff\1\15\16\uffff\14\22\24\uffff\4"+
            "\22\4\uffff\2\22\1\uffff\1\32\1\33\1\30\1\31",
            "\1\75\37\uffff\1\74\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\32\1\33\1\30\1\31",
            "\1\75\37\uffff\1\74\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\32\1\33\1\30\1\31",
            "\1\35\2\uffff\1\22\1\11\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\34\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\41\37\uffff\1\40\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\36\1\37\1\1\1\2",
            "\1\41\37\uffff\1\40\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\36\1\37\1\1\1\2",
            "\1\45\37\uffff\1\44\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\3\1\4\1\42\1\43",
            "\1\45\37\uffff\1\44\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\3\1\4\1\42\1\43",
            "\1\76",
            "\1\67\2\uffff\1\22\1\47\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\66\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\100\37\uffff\1\77\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13"+
            "\1\14\73\uffff\1\52\1\53\1\50\1\51",
            "\1\100\37\uffff\1\77\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13"+
            "\1\14\73\uffff\1\52\1\53\1\50\1\51",
            "\1\55\2\uffff\1\22\1\26\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\54\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\73\2\uffff\1\22\1\26\1\uffff\1\22\2\15\2\uffff\3\22\1\uffff"+
            "\1\17\20\uffff\1\27\1\12\3\uffff\2\22\1\uffff\1\10\5\uffff\1"+
            "\7\2\uffff\1\13\1\14\1\uffff\1\15\16\uffff\14\22\24\uffff\4"+
            "\22\4\uffff\2\22\1\uffff\1\32\1\33\1\30\1\31",
            "\1\101",
            "\1\75\37\uffff\1\74\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\32\1\33\1\30\1\31",
            "\1\67\2\uffff\1\22\1\47\1\uffff\1\22\4\uffff\3\22\22\uffff"+
            "\1\66\1\12\41\uffff\1\22\37\uffff\4\22\4\uffff\2\22",
            "\1\102",
            "\1\100\37\uffff\1\77\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13"+
            "\1\14\73\uffff\1\52\1\53\1\50\1\51",
            "\1\75\37\uffff\1\74\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13\1"+
            "\14\73\uffff\1\32\1\33\1\30\1\31",
            "\1\100\37\uffff\1\77\4\uffff\2\22\7\uffff\1\7\2\uffff\1\13"+
            "\1\14\73\uffff\1\52\1\53\1\50\1\51"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "118:1: proc_stmt : ( if_ex | flow | pick | while_ex | until_ex | foreach | scope_ex | ext_act | try_ex | corr_sets | ( ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque ) SEMI ) );";
        }
    }
    static final String DFA10_eotS =
        "\u00df\uffff";
    static final String DFA10_eofS =
        "\u00df\uffff";
    static final String DFA10_minS =
        "\1\122\3\127\1\122\1\uffff\2\127\1\122\1\uffff\2\127\4\uffff\4\127"+
        "\12\uffff\2\122\7\127\1\122\4\127\1\122\5\127\4\122\1\127\1\122"+
        "\4\127\1\122\4\127\1\122\4\127\1\122\2\127\4\122\5\127\3\122\2\127"+
        "\1\122\3\127\4\122\5\127\1\122\3\127\1\122\3\127\4\122\5\127\5\122"+
        "\5\127\2\122\1\127\1\122\1\127\4\122\5\127\1\122\3\127\2\122\5\127"+
        "\12\122\5\127\1\122\3\127\4\122\1\127\1\122\1\127\1\122\3\127\4"+
        "\122\5\127\13\122\5\127\20\122";
    static final String DFA10_maxS =
        "\1\u00c3\3\127\1\u00c3\1\uffff\2\127\1\u00be\1\uffff\2\127\4\uffff"+
        "\4\127\12\uffff\1\u00be\1\u00c3\7\127\1\u00be\4\127\1\u00be\5\127"+
        "\2\u00be\2\u00c3\1\127\1\u00be\4\127\1\u00be\4\127\1\u00c3\4\127"+
        "\1\u00be\2\127\3\u00c3\1\u00be\5\127\3\u00be\2\127\1\u00be\3\127"+
        "\4\u00be\5\127\1\u00be\3\127\1\u00c3\3\127\1\u00c3\3\u00be\5\127"+
        "\1\u00be\2\u00c3\2\u00be\5\127\2\u00be\1\127\1\u00c3\1\127\4\u00be"+
        "\5\127\1\u00be\3\127\2\u00be\5\127\6\u00be\4\u00c3\5\127\1\u00be"+
        "\3\127\4\u00be\1\127\1\u00c3\1\127\1\u00be\3\127\4\u00be\5\127\1"+
        "\u00be\1\u00c3\11\u00be\5\127\6\u00be\1\u00c3\11\u00be";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\3\uffff\1\2\2\uffff\1\3\1\4\1\5\1\6\4\uffff\1\7\1\10"+
        "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\u00c1\uffff";
    static final String DFA10_specialS =
        "\u00df\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\3\4\uffff\1\24\1\25\34\uffff\1\11\1\14\1\5\3\16\1\17\1\32\1"+
            "\26\1\30\1\33\1\35\4\uffff\1\34\1\27\2\31\14\uffff\1\1\1\2\1"+
            "\6\1\7\4\uffff\1\12\1\13\1\uffff\1\22\1\23\1\20\1\21",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\4\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\40\4\uffff\1\24\1\25\34\uffff\1\11\1\14\1\5\3\16\1\17\1\32"+
            "\1\26\1\30\1\33\1\35\24\uffff\1\45\1\46\1\52\1\53\4\uffff\1"+
            "\50\1\51\1\uffff\1\43\1\44\1\41\1\42",
            "",
            "\1\54",
            "\1\54",
            "\1\62\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\61\42\uffff\1\11\37\uffff\1\55\1\56\1\57\1\60\4\uffff\2\15",
            "",
            "\1\63",
            "\1\63",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\66\42\uffff\1\11\1\14\1\5\35\uffff\1\1\1\2\1\72\1\73\4\uffff"+
            "\1\70\1\71",
            "\1\101\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\3\4\uffff\1\24\1\25\34\uffff\1\11\1\14\1\5\3\16\1\17\1\32"+
            "\1\26\1\30\1\33\1\35\24\uffff\1\102\1\103\1\104\1\105\4\uffff"+
            "\1\107\1\110\1\uffff\1\77\1\100\1\75\1\76",
            "\1\111",
            "\1\112",
            "\1\112",
            "\1\113",
            "\1\113",
            "\1\114",
            "\1\114",
            "\1\122\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\121\42\uffff\1\11\37\uffff\1\115\1\116\1\117\1\120\4\uffff"+
            "\2\15",
            "\1\123",
            "\1\123",
            "\1\124",
            "\1\124",
            "\1\133\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\132\42\uffff\1\11\1\14\36\uffff\1\125\1\126\1\6\1\7\4\uffff"+
            "\1\130\1\131",
            "\1\134",
            "\1\134",
            "\1\135",
            "\1\135",
            "\1\136",
            "\1\62\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\61\42\uffff\1\11\37\uffff\1\55\1\56\1\57\1\60\4\uffff\2\15",
            "\1\144\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\143"+
            "\43\uffff\1\14\36\uffff\1\137\1\140\1\141\1\142\4\uffff\1\12"+
            "\1\13",
            "\1\150\37\uffff\1\147\4\uffff\1\24\1\25\107\uffff\1\145\1\146"+
            "\1\20\1\21",
            "\1\154\37\uffff\1\153\4\uffff\1\24\1\25\107\uffff\1\22\1\23"+
            "\1\151\1\152",
            "\1\155",
            "\1\67\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\66\42\uffff\1\11\1\14\1\5\35\uffff\1\1\1\2\1\72\1\73\4\uffff"+
            "\1\70\1\71",
            "\1\156",
            "\1\156",
            "\1\157",
            "\1\157",
            "\1\165\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\164\42\uffff\1\11\37\uffff\1\160\1\161\1\162\1\163\4\uffff"+
            "\2\15",
            "\1\166",
            "\1\166",
            "\1\167",
            "\1\167",
            "\1\101\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\3\4\uffff\1\24\1\25\34\uffff\1\11\1\14\1\5\3\16\1\17\1\32"+
            "\1\26\1\30\1\33\1\35\24\uffff\1\102\1\103\1\104\1\105\4\uffff"+
            "\1\107\1\110\1\uffff\1\77\1\100\1\75\1\76",
            "\1\170",
            "\1\170",
            "\1\171",
            "\1\171",
            "\1\177\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\176\42\uffff\1\11\37\uffff\1\172\1\173\1\174\1\175\4\uffff"+
            "\2\15",
            "\1\u0080",
            "\1\u0080",
            "\1\4\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\40\4\uffff\1\24\1\25\34\uffff\1\11\1\14\1\5\3\16\1\17\1\32"+
            "\1\26\1\30\1\33\1\35\24\uffff\1\45\1\46\1\52\1\53\4\uffff\1"+
            "\50\1\51\1\uffff\1\43\1\44\1\41\1\42",
            "\1\u0082\37\uffff\1\u0081\4\uffff\1\24\1\25\107\uffff\1\43"+
            "\1\44\1\41\1\42",
            "\1\u0082\37\uffff\1\u0081\4\uffff\1\24\1\25\107\uffff\1\43"+
            "\1\44\1\41\1\42",
            "\1\u0084\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0083\42\uffff\1\11\1\14\1\5\35\uffff\1\45\1\46\1\52\1\53"+
            "\4\uffff\1\50\1\51",
            "\1\u0085",
            "\1\u0085",
            "\1\u0086",
            "\1\u0086",
            "\1\u0087",
            "\1\122\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\121\42\uffff\1\11\37\uffff\1\115\1\116\1\117\1\120\4\uffff"+
            "\2\15",
            "\1\u008d\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008c\43\uffff\1\14\36\uffff\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\4\uffff\1\50\1\51",
            "\1\u0091\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0090\42\uffff\1\11\1\14\36\uffff\1\u008e\1\u008f\1\52\1"+
            "\53\4\uffff\1\50\1\51",
            "\1\u0092",
            "\1\u0092",
            "\1\u0098\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0097\42\uffff\1\11\37\uffff\1\u0093\1\u0094\1\u0095\1\u0096"+
            "\4\uffff\2\15",
            "\1\u0099",
            "\1\u0099",
            "\1\u009a",
            "\1\133\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\132\42\uffff\1\11\1\14\36\uffff\1\125\1\126\1\6\1\7\4\uffff"+
            "\1\130\1\131",
            "\1\62\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\61\42\uffff\1\11\37\uffff\1\55\1\56\1\57\1\60\4\uffff\2\15",
            "\1\62\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\61\42\uffff\1\11\37\uffff\1\55\1\56\1\57\1\60\4\uffff\2\15",
            "\1\62\2\uffff\1\15\1\10\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\61\42\uffff\1\11\37\uffff\1\55\1\56\1\57\1\60\4\uffff\2\15",
            "\1\u009b",
            "\1\u009b",
            "\1\u009c",
            "\1\u009c",
            "\1\u009d",
            "\1\144\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\143"+
            "\43\uffff\1\14\36\uffff\1\137\1\140\1\141\1\142\4\uffff\1\12"+
            "\1\13",
            "\1\u009e",
            "\1\u009e",
            "\1\u009f",
            "\1\150\37\uffff\1\147\4\uffff\1\24\1\25\107\uffff\1\145\1\146"+
            "\1\20\1\21",
            "\1\u00a0",
            "\1\u00a0",
            "\1\u00a1",
            "\1\154\37\uffff\1\153\4\uffff\1\24\1\25\107\uffff\1\22\1\23"+
            "\1\151\1\152",
            "\1\67\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\66\42\uffff\1\11\1\14\1\5\35\uffff\1\1\1\2\1\72\1\73\4\uffff"+
            "\1\70\1\71",
            "\1\u00a7\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00a6\43\uffff\1\14\36\uffff\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
            "\4\uffff\1\70\1\71",
            "\1\u00ab\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00aa\42\uffff\1\11\1\14\36\uffff\1\u00a8\1\u00a9\1\72\1"+
            "\73\4\uffff\1\70\1\71",
            "\1\u00ac",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ad",
            "\1\u00ae",
            "\1\165\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\164\42\uffff\1\11\37\uffff\1\160\1\161\1\162\1\163\4\uffff"+
            "\2\15",
            "\1\u00b0\37\uffff\1\u00af\4\uffff\1\24\1\25\107\uffff\1\77"+
            "\1\100\1\75\1\76",
            "\1\u00b0\37\uffff\1\u00af\4\uffff\1\24\1\25\107\uffff\1\77"+
            "\1\100\1\75\1\76",
            "\1\u00b2\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00b1\42\uffff\1\11\1\14\1\5\35\uffff\1\102\1\103\1\104\1"+
            "\105\4\uffff\1\107\1\110",
            "\1\u00b6\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00b5\42\uffff\1\11\1\14\36\uffff\1\u00b3\1\u00b4\1\104\1"+
            "\105\4\uffff\1\107\1\110",
            "\1\u00b7",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b8",
            "\1\u00b9",
            "\1\177\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\176\42\uffff\1\11\37\uffff\1\172\1\173\1\174\1\175\4\uffff"+
            "\2\15",
            "\1\u00bf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00be\43\uffff\1\14\36\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd"+
            "\4\uffff\1\107\1\110",
            "\1\u00c0",
            "\1\u0082\37\uffff\1\u0081\4\uffff\1\24\1\25\107\uffff\1\43"+
            "\1\44\1\41\1\42",
            "\1\u00c1",
            "\1\u0084\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0083\42\uffff\1\11\1\14\1\5\35\uffff\1\45\1\46\1\52\1\53"+
            "\4\uffff\1\50\1\51",
            "\1\122\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\121\42\uffff\1\11\37\uffff\1\115\1\116\1\117\1\120\4\uffff"+
            "\2\15",
            "\1\122\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\121\42\uffff\1\11\37\uffff\1\115\1\116\1\117\1\120\4\uffff"+
            "\2\15",
            "\1\122\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\121\42\uffff\1\11\37\uffff\1\115\1\116\1\117\1\120\4\uffff"+
            "\2\15",
            "\1\u00c2",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u008d\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008c\43\uffff\1\14\36\uffff\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\4\uffff\1\50\1\51",
            "\1\u00c5",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u0091\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0090\42\uffff\1\11\1\14\36\uffff\1\u008e\1\u008f\1\52\1"+
            "\53\4\uffff\1\50\1\51",
            "\1\133\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\132\42\uffff\1\11\1\14\36\uffff\1\125\1\126\1\6\1\7\4\uffff"+
            "\1\130\1\131",
            "\1\u00c7",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u0098\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0097\42\uffff\1\11\37\uffff\1\u0093\1\u0094\1\u0095\1\u0096"+
            "\4\uffff\2\15",
            "\1\u00cf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ce\43\uffff\1\14\36\uffff\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
            "\4\uffff\1\130\1\131",
            "\1\133\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\132\42\uffff\1\11\1\14\36\uffff\1\125\1\126\1\6\1\7\4\uffff"+
            "\1\130\1\131",
            "\1\144\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\143"+
            "\43\uffff\1\14\36\uffff\1\137\1\140\1\141\1\142\4\uffff\1\12"+
            "\1\13",
            "\1\144\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\143"+
            "\43\uffff\1\14\36\uffff\1\137\1\140\1\141\1\142\4\uffff\1\12"+
            "\1\13",
            "\1\144\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1\143"+
            "\43\uffff\1\14\36\uffff\1\137\1\140\1\141\1\142\4\uffff\1\12"+
            "\1\13",
            "\1\150\37\uffff\1\147\4\uffff\1\24\1\25\107\uffff\1\145\1\146"+
            "\1\20\1\21",
            "\1\150\37\uffff\1\147\4\uffff\1\24\1\25\107\uffff\1\145\1\146"+
            "\1\20\1\21",
            "\1\154\37\uffff\1\153\4\uffff\1\24\1\25\107\uffff\1\22\1\23"+
            "\1\151\1\152",
            "\1\154\37\uffff\1\153\4\uffff\1\24\1\25\107\uffff\1\22\1\23"+
            "\1\151\1\152",
            "\1\u00d0",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00a7\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00a6\43\uffff\1\14\36\uffff\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
            "\4\uffff\1\70\1\71",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00ab\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00aa\42\uffff\1\11\1\14\36\uffff\1\u00a8\1\u00a9\1\72\1"+
            "\73\4\uffff\1\70\1\71",
            "\1\165\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\164\42\uffff\1\11\37\uffff\1\160\1\161\1\162\1\163\4\uffff"+
            "\2\15",
            "\1\165\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\164\42\uffff\1\11\37\uffff\1\160\1\161\1\162\1\163\4\uffff"+
            "\2\15",
            "\1\165\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\164\42\uffff\1\11\37\uffff\1\160\1\161\1\162\1\163\4\uffff"+
            "\2\15",
            "\1\u00d5",
            "\1\u00b0\37\uffff\1\u00af\4\uffff\1\24\1\25\107\uffff\1\77"+
            "\1\100\1\75\1\76",
            "\1\u00d6",
            "\1\u00b2\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00b1\42\uffff\1\11\1\14\1\5\35\uffff\1\102\1\103\1\104\1"+
            "\105\4\uffff\1\107\1\110",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00b6\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00b5\42\uffff\1\11\1\14\36\uffff\1\u00b3\1\u00b4\1\104\1"+
            "\105\4\uffff\1\107\1\110",
            "\1\177\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\176\42\uffff\1\11\37\uffff\1\172\1\173\1\174\1\175\4\uffff"+
            "\2\15",
            "\1\177\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\176\42\uffff\1\11\37\uffff\1\172\1\173\1\174\1\175\4\uffff"+
            "\2\15",
            "\1\177\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\176\42\uffff\1\11\37\uffff\1\172\1\173\1\174\1\175\4\uffff"+
            "\2\15",
            "\1\u00d9",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00da",
            "\1\u00db",
            "\1\u00bf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00be\43\uffff\1\14\36\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd"+
            "\4\uffff\1\107\1\110",
            "\1\u0082\37\uffff\1\u0081\4\uffff\1\24\1\25\107\uffff\1\43"+
            "\1\44\1\41\1\42",
            "\1\u0084\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0083\42\uffff\1\11\1\14\1\5\35\uffff\1\45\1\46\1\52\1\53"+
            "\4\uffff\1\50\1\51",
            "\1\u008d\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008c\43\uffff\1\14\36\uffff\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\4\uffff\1\50\1\51",
            "\1\u008d\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008c\43\uffff\1\14\36\uffff\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\4\uffff\1\50\1\51",
            "\1\u008d\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u008c\43\uffff\1\14\36\uffff\1\u0088\1\u0089\1\u008a\1\u008b"+
            "\4\uffff\1\50\1\51",
            "\1\u0091\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0090\42\uffff\1\11\1\14\36\uffff\1\u008e\1\u008f\1\52\1"+
            "\53\4\uffff\1\50\1\51",
            "\1\u0091\2\uffff\1\15\1\47\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0090\42\uffff\1\11\1\14\36\uffff\1\u008e\1\u008f\1\52\1"+
            "\53\4\uffff\1\50\1\51",
            "\1\u0098\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0097\42\uffff\1\11\37\uffff\1\u0093\1\u0094\1\u0095\1\u0096"+
            "\4\uffff\2\15",
            "\1\u0098\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0097\42\uffff\1\11\37\uffff\1\u0093\1\u0094\1\u0095\1\u0096"+
            "\4\uffff\2\15",
            "\1\u0098\2\uffff\1\15\1\127\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u0097\42\uffff\1\11\37\uffff\1\u0093\1\u0094\1\u0095\1\u0096"+
            "\4\uffff\2\15",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00cf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ce\43\uffff\1\14\36\uffff\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
            "\4\uffff\1\130\1\131",
            "\1\u00a7\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00a6\43\uffff\1\14\36\uffff\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
            "\4\uffff\1\70\1\71",
            "\1\u00a7\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00a6\43\uffff\1\14\36\uffff\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
            "\4\uffff\1\70\1\71",
            "\1\u00a7\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00a6\43\uffff\1\14\36\uffff\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
            "\4\uffff\1\70\1\71",
            "\1\u00ab\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00aa\42\uffff\1\11\1\14\36\uffff\1\u00a8\1\u00a9\1\72\1"+
            "\73\4\uffff\1\70\1\71",
            "\1\u00ab\2\uffff\1\15\1\74\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00aa\42\uffff\1\11\1\14\36\uffff\1\u00a8\1\u00a9\1\72\1"+
            "\73\4\uffff\1\70\1\71",
            "\1\u00b0\37\uffff\1\u00af\4\uffff\1\24\1\25\107\uffff\1\77"+
            "\1\100\1\75\1\76",
            "\1\u00b2\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00b1\42\uffff\1\11\1\14\1\5\35\uffff\1\102\1\103\1\104\1"+
            "\105\4\uffff\1\107\1\110",
            "\1\u00b6\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00b5\42\uffff\1\11\1\14\36\uffff\1\u00b3\1\u00b4\1\104\1"+
            "\105\4\uffff\1\107\1\110",
            "\1\u00b6\2\uffff\1\15\1\106\1\uffff\1\15\4\uffff\3\15\22\uffff"+
            "\1\u00b5\42\uffff\1\11\1\14\36\uffff\1\u00b3\1\u00b4\1\104\1"+
            "\105\4\uffff\1\107\1\110",
            "\1\u00bf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00be\43\uffff\1\14\36\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd"+
            "\4\uffff\1\107\1\110",
            "\1\u00bf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00be\43\uffff\1\14\36\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd"+
            "\4\uffff\1\107\1\110",
            "\1\u00bf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00be\43\uffff\1\14\36\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd"+
            "\4\uffff\1\107\1\110",
            "\1\u00cf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ce\43\uffff\1\14\36\uffff\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
            "\4\uffff\1\130\1\131",
            "\1\u00cf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ce\43\uffff\1\14\36\uffff\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
            "\4\uffff\1\130\1\131",
            "\1\u00cf\2\uffff\2\15\1\uffff\1\15\4\uffff\3\15\22\uffff\1"+
            "\u00ce\43\uffff\1\14\36\uffff\1\u00ca\1\u00cb\1\u00cc\1\u00cd"+
            "\4\uffff\1\130\1\131"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "123:6: ( invoke | receive | reply | assign | throw_ex | rethrow_ex | alarm | timeout | exit | variables | validate | partner_links | compensate | nop | messages | opaque )";
        }
    }
    static final String DFA25_eotS =
        "\50\uffff";
    static final String DFA25_eofS =
        "\50\uffff";
    static final String DFA25_minS =
        "\1\122\5\127\1\122\3\uffff\3\122\10\127\1\122\3\127\1\122\4\127"+
        "\12\122";
    static final String DFA25_maxS =
        "\1\u00c3\5\127\1\u00c3\3\uffff\3\u00c3\10\127\1\u00c3\3\127\1\u00c3"+
        "\4\127\12\u00c3";
    static final String DFA25_acceptS =
        "\7\uffff\1\1\1\2\1\3\36\uffff";
    static final String DFA25_specialS =
        "\50\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\6\33\uffff\1\11\3\uffff\1\5\4\uffff\1\7\1\10\1\11\3\uffff"+
            "\2\11\101\uffff\1\3\1\4\1\1\1\2",
            "\1\12",
            "\1\12",
            "\1\13",
            "\1\13",
            "\1\14",
            "\1\6\37\uffff\1\21\4\uffff\1\7\1\10\107\uffff\1\17\1\20\1\15"+
            "\1\16",
            "",
            "",
            "",
            "\1\25\37\uffff\1\24\4\uffff\1\7\1\10\107\uffff\1\22\1\23\1"+
            "\1\1\2",
            "\1\31\37\uffff\1\30\4\uffff\1\7\1\10\107\uffff\1\3\1\4\1\26"+
            "\1\27",
            "\1\36\37\uffff\1\5\4\uffff\1\7\1\10\107\uffff\1\34\1\35\1\32"+
            "\1\33",
            "\1\37",
            "\1\37",
            "\1\40",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\25\37\uffff\1\24\4\uffff\1\7\1\10\107\uffff\1\22\1\23\1"+
            "\1\1\2",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\31\37\uffff\1\30\4\uffff\1\7\1\10\107\uffff\1\3\1\4\1\26"+
            "\1\27",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\36\37\uffff\1\5\4\uffff\1\7\1\10\107\uffff\1\34\1\35\1\32"+
            "\1\33",
            "\1\6\37\uffff\1\21\4\uffff\1\7\1\10\107\uffff\1\17\1\20\1\15"+
            "\1\16",
            "\1\6\37\uffff\1\21\4\uffff\1\7\1\10\107\uffff\1\17\1\20\1\15"+
            "\1\16",
            "\1\6\37\uffff\1\21\4\uffff\1\7\1\10\107\uffff\1\17\1\20\1\15"+
            "\1\16",
            "\1\25\37\uffff\1\24\4\uffff\1\7\1\10\107\uffff\1\22\1\23\1"+
            "\1\1\2",
            "\1\25\37\uffff\1\24\4\uffff\1\7\1\10\107\uffff\1\22\1\23\1"+
            "\1\1\2",
            "\1\31\37\uffff\1\30\4\uffff\1\7\1\10\107\uffff\1\3\1\4\1\26"+
            "\1\27",
            "\1\31\37\uffff\1\30\4\uffff\1\7\1\10\107\uffff\1\3\1\4\1\26"+
            "\1\27",
            "\1\36\37\uffff\1\5\4\uffff\1\7\1\10\107\uffff\1\34\1\35\1\32"+
            "\1\33",
            "\1\36\37\uffff\1\5\4\uffff\1\7\1\10\107\uffff\1\34\1\35\1\32"+
            "\1\33"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "152:3: ( alarm | timeout )?";
        }
    }
    static final String DFA103_eotS =
        "\13\uffff";
    static final String DFA103_eofS =
        "\13\uffff";
    static final String DFA103_minS =
        "\1\122\12\uffff";
    static final String DFA103_maxS =
        "\1\u00be\12\uffff";
    static final String DFA103_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA103_specialS =
        "\13\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\12\2\uffff\1\1\1\3\1\uffff\1\1\4\uffff\1\4\1\5\1\6\22\uffff"+
            "\1\11\102\uffff\2\2\2\10\4\uffff\2\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "()* loopback of 305:4: ({...}?pt= portType | {...}?ci= CREATE_INST | {...}?val= VALID | {...}?ke= KEEPSRC | {...}?ig= IGNORE | {...}?fn= faultName | {...}?msg= msgEx | {...}? ( '@name' name= STRING ) | {...}?suppressJoinFailure= SJF )*";
        }
    }
    static final String DFA107_eotS =
        "\27\uffff";
    static final String DFA107_eofS =
        "\27\uffff";
    static final String DFA107_minS =
        "\1\60\2\127\1\uffff\1\127\1\122\3\uffff\2\122\4\127\1\122\2\127"+
        "\5\122";
    static final String DFA107_maxS =
        "\1\u00b8\2\127\1\uffff\1\127\1\u00b8\3\uffff\2\u00b8\4\127\1\u00b8"+
        "\2\127\5\u00b8";
    static final String DFA107_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\1\3\1\4\16\uffff";
    static final String DFA107_specialS =
        "\27\uffff}>";
    static final String[] DFA107_transitionS = {
            "\1\7\41\uffff\1\5\2\uffff\1\7\1\3\1\7\1\10\15\uffff\1\7\13\uffff"+
            "\1\4\2\uffff\1\7\37\uffff\1\3\1\uffff\1\6\35\uffff\1\1\1\2\2"+
            "\3",
            "\1\11",
            "\1\11",
            "",
            "\1\12",
            "\1\5\3\uffff\1\3\33\uffff\1\15\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\13\1\14\2\3",
            "",
            "",
            "",
            "\1\17\3\uffff\1\3\33\uffff\1\16\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\1\1\2\2\3",
            "\1\22\3\uffff\1\3\33\uffff\1\4\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\20\1\21\2\3",
            "\1\23",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\17\3\uffff\1\3\33\uffff\1\16\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\1\1\2\2\3",
            "\1\26",
            "\1\26",
            "\1\22\3\uffff\1\3\33\uffff\1\4\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\20\1\21\2\3",
            "\1\5\3\uffff\1\3\33\uffff\1\15\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\13\1\14\2\3",
            "\1\5\3\uffff\1\3\33\uffff\1\15\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\13\1\14\2\3",
            "\1\17\3\uffff\1\3\33\uffff\1\16\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\1\1\2\2\3",
            "\1\22\3\uffff\1\3\33\uffff\1\4\42\uffff\1\3\1\uffff\1\6\35"+
            "\uffff\1\20\1\21\2\3"
    };

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "313:1: rvalue : ( receive | invoke | expr ( PROP )? | OPAQUE_EXPR );";
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program328 = new BitSet(new long[]{0x0000000000000002L,0x00002004000C0000L,0x0800000600000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_process_in_declaration347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_declaration_in_declaration351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_sub_declaration361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extension_in_sub_declaration365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_imports_in_sub_declaration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_process389 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_process398 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_SJF_in_process407 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_EOSF_in_process416 = new BitSet(new long[]{0x0000000000000000L,0x00002000000C0000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_109_in_process424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ns_id_in_process426 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_std_attr_in_process428 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_ajoin_in_process434 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_asignal_in_process439 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_block_in_process445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_eventHdl_in_process447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_in_proc_stmts502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts504 = new BitSet(new long[]{0x0000000000000000L,0x058C0002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_proc_stmt_in_proc_stmts508 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_signal_in_proc_stmts513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmts515 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_if_ex_in_proc_stmt546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flow_in_proc_stmt550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pick_in_proc_stmt554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_ex_in_proc_stmt558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_until_ex_in_proc_stmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreach_in_proc_stmt566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_ex_in_proc_stmt570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ext_act_in_proc_stmt574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_ex_in_proc_stmt581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_corr_sets_in_proc_stmt585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_proc_stmt596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_receive_in_proc_stmt600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_reply_in_proc_stmt604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_assign_in_proc_stmt608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_throw_ex_in_proc_stmt612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rethrow_ex_in_proc_stmt616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_alarm_in_proc_stmt620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_timeout_in_proc_stmt624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_exit_in_proc_stmt628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variables_in_proc_stmt634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_validate_in_proc_stmt638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_partner_links_in_proc_stmt642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_compensate_in_proc_stmt646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_nop_in_proc_stmt650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_messages_in_proc_stmt654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_opaque_in_proc_stmt658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_proc_stmt661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_block672 = new BitSet(new long[]{0x0000000000000000L,0x858C0002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_proc_stmts_in_block674 = new BitSet(new long[]{0x0000000000000000L,0x858C8002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_111_in_block677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_scope_block695 = new BitSet(new long[]{0x0000000000000000L,0x858C2006EF6C0000L,0x69E003E7FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sub_declaration_in_scope_block697 = new BitSet(new long[]{0x0000000000000000L,0x858C2006EF6C0000L,0x69E003E7FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_proc_stmts_in_scope_block700 = new BitSet(new long[]{0x0000000000000000L,0x858C8002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_111_in_scope_block703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_param_block723 = new BitSet(new long[]{0x0000000000000000L,0x858D0002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_112_in_param_block726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param_block730 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_param_block733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param_block737 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_param_block741 = new BitSet(new long[]{0x0000000000000000L,0x858C0002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_proc_stmts_in_param_block745 = new BitSet(new long[]{0x0000000000000000L,0x858C8002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_111_in_param_block748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_body770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proc_stmts_in_body774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_INST_in_pick789 = new BitSet(new long[]{0x0000000000000000L,0x000C000000440000L});
    public static final BitSet FOLLOW_114_in_pick816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_pick820 = new BitSet(new long[]{0x0000000000000000L,0x000C000000440000L});
    public static final BitSet FOLLOW_SJF_in_pick829 = new BitSet(new long[]{0x0000000000000000L,0x000C000000440000L});
    public static final BitSet FOLLOW_115_in_pick836 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_pick838 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_onMessage_in_pick840 = new BitSet(new long[]{0x0000000000000000L,0x6394C00000040000L,0x01E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_onAlarm_in_pick843 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_111_in_pick846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onMessage899 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_msgEx_in_onMessage907 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x01E0000000000000L});
    public static final BitSet FOLLOW_116_in_onMessage914 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_onMessage916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onMessage920 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onMessage926 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_onMessage929 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_onMessage931 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_onMessage935 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_onMessage937 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_param_block_in_onMessage950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alarm_in_onAlarm1022 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_timeout_in_onAlarm1026 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_repeatEvery_in_onAlarm1030 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scope_short_in_onAlarm1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_alarm1076 = new BitSet(new long[]{0x0000000000000000L,0x0084000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_alarm1085 = new BitSet(new long[]{0x0000000000000000L,0x0084000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_114_in_alarm1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_alarm1117 = new BitSet(new long[]{0x0000000000000000L,0x0084000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_SJF_in_alarm1126 = new BitSet(new long[]{0x0000000000000000L,0x0084000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_119_in_alarm1134 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_alarm1136 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_alarm1139 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_alarm1143 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_alarm1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_timeout1191 = new BitSet(new long[]{0x0000000000000000L,0x0104000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_timeout1200 = new BitSet(new long[]{0x0000000000000000L,0x0104000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_114_in_timeout1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_timeout1232 = new BitSet(new long[]{0x0000000000000000L,0x0104000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_SJF_in_timeout1241 = new BitSet(new long[]{0x0000000000000000L,0x0104000000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_120_in_timeout1249 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_timeout1251 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_timeout1254 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_timeout1258 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_timeout1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_repeatEvery1299 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_repeatEvery1301 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_repeatEvery1304 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_repeatEvery1308 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_repeatEvery1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_flow1334 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_flow1338 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sequence_in_flow1342 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_flow1346 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sequence_in_flow1350 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_queryLg_in_signal1381 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_exprLg_in_signal1387 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_queryLg_in_signal1397 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_signal1404 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_signal1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_signal1407 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_signal1410 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_signal1413 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_signal1417 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_signal1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_asignal1450 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_asignal1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_asignal1453 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_asignal1456 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_asignal1459 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_asignal1463 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_asignal1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ajoin1491 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ajoin1493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_ajoin1497 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_ajoin1504 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_ajoin1509 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_ajoin1512 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_ajoin1516 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ajoin1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_join1550 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_exprLg_in_join1556 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_queryLg_in_join1566 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_join1572 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_join1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_join1578 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_join1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_join1585 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_join1590 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_join1593 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_join1597 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_join1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_if_ex1643 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000001L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_if_ex1652 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000001L,0x000000000000000FL});
    public static final BitSet FOLLOW_114_in_if_ex1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_if_ex1684 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000001L,0x000000000000000FL});
    public static final BitSet FOLLOW_SJF_in_if_ex1693 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000001L,0x000000000000000FL});
    public static final BitSet FOLLOW_128_in_if_ex1700 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_if_ex1702 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1707 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1713 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_if_ex1716 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sequence_in_if_ex1720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L,0x000000000000000FL});
    public static final BitSet FOLLOW_queryLg_in_if_ex1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_if_ex1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_129_in_if_ex1751 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_if_ex1753 = new BitSet(new long[]{0x0001000000000000L,0x00640040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_if_ex1758 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_if_ex1767 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_if_ex1773 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sequence_in_if_ex1777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L,0x000000000000000FL});
    public static final BitSet FOLLOW_130_in_if_ex1788 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sequence_in_if_ex1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_sequence1870 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_ajoin_in_sequence1876 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_asignal_in_sequence1881 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_body_in_sequence1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ajoin_in_scope_sequence1921 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_asignal_in_scope_sequence1926 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scope_block_in_scope_sequence1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_while_ex1966 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000008L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_while_ex1975 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000008L,0x000000000000000FL});
    public static final BitSet FOLLOW_114_in_while_ex2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_while_ex2007 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000008L,0x000000000000000FL});
    public static final BitSet FOLLOW_SJF_in_while_ex2016 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000008L,0x000000000000000FL});
    public static final BitSet FOLLOW_131_in_while_ex2024 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_while_ex2026 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_while_ex2029 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_while_ex2031 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_while_ex2034 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sequence_in_while_ex2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryLg_in_until_ex2079 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_until_ex2088 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_114_in_until_ex2116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_until_ex2120 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_SJF_in_until_ex2129 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000000000010L,0x000000000000000FL});
    public static final BitSet FOLLOW_132_in_until_ex2137 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_sequence_in_until_ex2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_until_ex2143 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_until_ex2145 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_until_ex2148 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_until_ex2150 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_until_ex2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARALLEL_in_foreach2195 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SBO_in_foreach2203 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_114_in_foreach2230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_foreach2234 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SJF_in_foreach2243 = new BitSet(new long[]{0x0000000000000000L,0x0004000006040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_foreach2250 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_foreach2252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_queryLg_in_foreach2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_foreach2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ID_in_foreach2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_foreach2277 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_expr_in_foreach2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_foreach2295 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_SEMI_in_foreach2297 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_queryLg_in_foreach2305 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_foreach2314 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_in_foreach2321 = new BitSet(new long[]{0x0000000000000000L,0x0040000000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach2327 = new BitSet(new long[]{0x0000000000000000L,0x0040000000100000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_foreach2336 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_SEMI_in_foreach2338 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_queryLg_in_foreach2346 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_exprLg_in_foreach2355 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_in_foreach2362 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_foreach2368 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_foreach2384 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scope_short_in_foreach2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_try_ex2501 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_body_in_try_ex2503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000003800L});
    public static final BitSet FOLLOW_catch_ex_in_try_ex2505 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x8000000000003800L});
    public static final BitSet FOLLOW_catchAll_in_try_ex2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_catch_ex2533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_catch_ex2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_faultElt_in_catch_ex2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_catch_ex2549 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_catch_ex2551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ns_id_in_catch_ex2553 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_catch_ex2556 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_param_block_in_catch_ex2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_catchAll2588 = new BitSet(new long[]{0x0000000000000000L,0x6004400000040000L});
    public static final BitSet FOLLOW_block_in_catchAll2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISOLATED_in_scope_ex2615 = new BitSet(new long[]{0x0000000000000000L,0x00000000080C0000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EOSF_in_scope_ex2623 = new BitSet(new long[]{0x0000000000000000L,0x00000000080C0000L,0x0000000000004000L});
    public static final BitSet FOLLOW_SJF_in_scope_ex2631 = new BitSet(new long[]{0x0000000000000000L,0x00000000080C0000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_scope_ex2638 = new BitSet(new long[]{0x0000000000000000L,0x63A4400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_117_in_scope_ex2641 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L});
    public static final BitSet FOLLOW_ID_in_scope_ex2643 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_scope_ex2646 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scope_sequence_in_scope_ex2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_ex2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_sequence_in_scope_short2695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_scope_stmt_in_scope_short2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compensation_in_scope_stmt2722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_termination_in_scope_stmt2730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_eventHdl_in_scope_stmt2738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_143_in_termination2774 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_body_in_termination2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_eventHdl2794 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_eventHdl2796 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000240000L,0x17E0000000020000L,0x000000000000000FL});
    public static final BitSet FOLLOW_onEvent_in_eventHdl2798 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000240000L,0x17E0000000020000L,0x000000000000000FL});
    public static final BitSet FOLLOW_onAlarm_in_eventHdl2801 = new BitSet(new long[]{0x0000000000000000L,0x6384C00000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_111_in_eventHdl2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_onEvent2835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_msgEx_in_onEvent2843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_msgType_in_onEvent2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_viElt_in_onEvent2857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L,0x17E0000000020000L});
    public static final BitSet FOLLOW_ID_in_onEvent2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_onEvent2871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_onEvent2876 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_onEvent2878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onEvent2882 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent2884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_onEvent2888 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_onEvent2891 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_onEvent2893 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_onEvent2897 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_with_ex_in_onEvent2899 = new BitSet(new long[]{0x0000000000000000L,0x6384400000040000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scope_short_in_onEvent2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_compensation2960 = new BitSet(new long[]{0x0000000000000000L,0xE58C4002EF6C0000L,0x61E003E1FFE04459L,0x000000000000000FL});
    public static final BitSet FOLLOW_body_in_compensation2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_with_ex2981 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_with_ex2983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2987 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_with_ex2990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_with_map_in_with_ex2994 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_118_in_with_ex2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_with_map3024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_with_map3026 = new BitSet(new long[]{0x0000000000000000L,0x00040000F1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_KEY_in_with_map3028 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_path_expr_in_with_map3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_receive3068 = new BitSet(new long[]{0x0000000000000000L,0x0004000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_msgEx_in_receive3076 = new BitSet(new long[]{0x0000000000000000L,0x0004000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_CREATE_INST_in_receive3084 = new BitSet(new long[]{0x0000000000000000L,0x0004000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_114_in_receive3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_receive3114 = new BitSet(new long[]{0x0000000000000000L,0x0004000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_SJF_in_receive3123 = new BitSet(new long[]{0x0000000000000000L,0x0004000000440000L,0x01E0000000200000L});
    public static final BitSet FOLLOW_149_in_receive3130 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_receive3132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_receive3136 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_receive3138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_receive3142 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_receive3145 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_receive3147 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_receive3151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_receive3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_reply3212 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_faultName_in_reply3220 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_msgEx_in_reply3228 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_114_in_reply3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_reply3257 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_SJF_in_reply3266 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x61E0000000400000L});
    public static final BitSet FOLLOW_150_in_reply3273 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_reply3275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_reply3279 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_reply3281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_reply3285 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_reply3288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_reply3292 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_reply3297 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_reply3299 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_reply3303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_reply3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_invoke3366 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0060000000800000L});
    public static final BitSet FOLLOW_114_in_invoke3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_invoke3395 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0060000000800000L});
    public static final BitSet FOLLOW_SJF_in_invoke3404 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0060000000800000L});
    public static final BitSet FOLLOW_151_in_invoke3411 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_invoke3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_invoke3417 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_invoke3419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_invoke3423 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_invoke3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_invoke3430 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_invoke3435 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_correlation_in_invoke3437 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_invoke3441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_with_ex_in_invoke3443 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_compensation_in_invoke3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_portType_in_assign3507 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_CREATE_INST_in_assign3515 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_VALID_in_assign3523 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_KEEPSRC_in_assign3531 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_IGNORE_in_assign3543 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_faultName_in_assign3551 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_msgEx_in_assign3559 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_114_in_assign3587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_assign3591 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_SJF_in_assign3600 = new BitSet(new long[]{0x0000000000000000L,0x00040000E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_assign3610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_path_expr_in_assign3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_PROP_in_assign3616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_assign3620 = new BitSet(new long[]{0x0001000000000000L,0x00240040E1E40000L,0x61E0000000A00000L});
    public static final BitSet FOLLOW_rvalue_in_assign3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_receive_in_rvalue3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invoke_in_rvalue3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_rvalue3697 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_PROP_in_rvalue3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPAQUE_EXPR_in_rvalue3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_throw_ex3725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_153_in_throw_ex3728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_throw_ex3733 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000007000000L});
    public static final BitSet FOLLOW_114_in_throw_ex3753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_throw_ex3757 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000007000000L});
    public static final BitSet FOLLOW_SJF_in_throw_ex3766 = new BitSet(new long[]{0x0000000000000000L,0x0004000000040000L,0x0000000007000000L});
    public static final BitSet FOLLOW_154_in_throw_ex3773 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_throw_ex3775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ns_id_in_throw_ex3777 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_throw_ex3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_rethrow_ex3816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_155_in_rethrow_ex3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_compensate3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_156_in_compensate3841 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_compensate3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_compensate3848 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_compensate3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_exit3875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_157_in_exit3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_validate3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_158_in_validate3902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_validate3906 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_validate3909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_validate3913 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_std_attr_in_ext_act3937 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_EXT_ACT_in_ext_act3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_nop3965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_159_in_nop3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_std_attr_in_opaque3989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_160_in_opaque3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_namespace4013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_namespace4015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_namespace4017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_namespace4019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_namespace4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUSTUND_in_extension4042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_extension4048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_extension4050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_extension4052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_extension4054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_extension4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_viType_in_imports4081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_163_in_imports4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_imports4092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_imports4094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_ID_in_imports4099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_imports4101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_imports4108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_imports4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_messages4144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_messages4148 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_messages4151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_message_in_messages4155 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_message4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_variables4193 = new BitSet(new long[]{0x0000000000000000L,0x00002004002C0000L,0x1FE0000600000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_variable_in_variables4197 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_variables4200 = new BitSet(new long[]{0x0000000000000000L,0x00002004002C0000L,0x1FE0000600000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_variable_in_variables4204 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_msgType_in_variable4234 = new BitSet(new long[]{0x0000000000000000L,0x00002004002C0000L,0x1FE0000600000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_viType_in_variable4242 = new BitSet(new long[]{0x0000000000000000L,0x00002004002C0000L,0x1FE0000600000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_viElt_in_variable4250 = new BitSet(new long[]{0x0000000000000000L,0x00002004002C0000L,0x1FE0000600000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ID_in_variable4257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_with_ex_in_variable4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_partner_links4300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_168_in_partner_links4304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links4309 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_partner_links4312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_partner_link_in_partner_links4316 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ID_in_partner_link4338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_partner_link4340 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_partner_link4342 = new BitSet(new long[]{0x0000000000000000L,0x0042000000200000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link4346 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link4350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link4354 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link4359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ns_id_in_partner_link4363 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_partner_link4368 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_INITPARTNER_in_partner_link4372 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_partner_link4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_correlation4412 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation4414 = new BitSet(new long[]{0x0000000000000000L,0x0002800000000000L});
    public static final BitSet FOLLOW_113_in_correlation4417 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_corr_mapping_in_correlation4419 = new BitSet(new long[]{0x0000000000000000L,0x0002800000000000L});
    public static final BitSet FOLLOW_111_in_correlation4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_COR_in_corr_mapping4447 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_PATTERN_COR_in_corr_mapping4455 = new BitSet(new long[]{0x0000000000000000L,0x0000003000200000L});
    public static final BitSet FOLLOW_ID_in_corr_mapping4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_corr_sets4499 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_corr_sets4501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets4506 = new BitSet(new long[]{0x0000000000000000L,0x0000800000200000L});
    public static final BitSet FOLLOW_corr_set_in_corr_sets4511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_corr_sets4513 = new BitSet(new long[]{0x0000000000000000L,0x0000800000200000L});
    public static final BitSet FOLLOW_111_in_corr_sets4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_corr_set4537 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_corr_set4539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_corr_set4543 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_113_in_corr_set4546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_corr_set4550 = new BitSet(new long[]{0x0000000000000000L,0x0042000000000000L});
    public static final BitSet FOLLOW_118_in_corr_set4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_s_expr_in_expr4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXT_EXPR_in_expr4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funct_call_in_expr4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funct_call4594 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_funct_call4596 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L});
    public static final BitSet FOLLOW_ID_in_funct_call4600 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L});
    public static final BitSet FOLLOW_118_in_funct_call4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_s_expr4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr4628 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000FC0000000000L});
    public static final BitSet FOLLOW_170_in_condExpr4633 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_171_in_condExpr4637 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_172_in_condExpr4641 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_173_in_condExpr4645 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_174_in_condExpr4649 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_175_in_condExpr4653 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_aexpr_in_condExpr4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr4669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_set_in_aexpr4672 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_mexpr_in_aexpr4680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr4690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_set_in_mexpr4693 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1640000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_atom_in_mexpr4701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000C000000000000L});
    public static final BitSet FOLLOW_STRING_in_mexpr4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_expr_in_atom4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_atom4723 = new BitSet(new long[]{0x0000000000000000L,0x00240040E1E40000L,0x61E0000000000000L});
    public static final BitSet FOLLOW_s_expr_in_atom4725 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_atom4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ns_id_in_path_expr4740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_180_in_path_expr4743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ns_id_in_path_expr4747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_ID_in_ns_id4770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_ns_id4772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_ns_id4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_portType4803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_182_in_portType4807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_portType4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_std_attr4834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_std_attr4838 = new BitSet(new long[]{0x0000000000000002L,0x0004000000040000L});
    public static final BitSet FOLLOW_SJF_in_std_attr4847 = new BitSet(new long[]{0x0000000000000002L,0x0004000000040000L});
    public static final BitSet FOLLOW_183_in_msgEx4886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_184_in_msgEx4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_msgEx4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_msgType4913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_186_in_msgType4917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_msgType4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_viType4942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_viType4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_viElt4966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_viElt4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_faultName4989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_190_in_faultName4993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_faultName4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_faultElt5014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_faultElt5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_exprLg5039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_193_in_exprLg5043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_exprLg5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_queryLg5067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_195_in_queryLg5071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_queryLg5074 = new BitSet(new long[]{0x0000000000000002L});

}