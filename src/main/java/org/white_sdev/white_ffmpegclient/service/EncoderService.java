/*
 *  Filename:  EncoderService.java
 *  Creation Date:  Jul 15, 2020
 *  Purpose:   
 *  Author:    <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * 
 *  *** Creative Commons Attribution 4.0 International Public License ***
 *  Web Version: https://creativecommons.org/licenses/by/4.0/legalcode
 * 
 * By exercising the Licensed Rights (defined below), You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
 * 
 * Section 1 – Definitions.
 * 
 * Adapted Material means material subject to Copyright and Similar Rights that is derived from or based upon the Licensed Material and in which the Licensed Material is translated, altered, arranged, transformed, or otherwise modified in a manner requiring permission under the Copyright and Similar Rights held by the Licensor. For purposes of this Public License, where the Licensed Material is a musical work, performance, or sound recording, Adapted Material is always produced where the Licensed Material is synched in timed relation with a moving image.
 * Adapter's License means the license You apply to Your Copyright and Similar Rights in Your contributions to Adapted Material in accordance with the terms and conditions of this Public License.
 * Copyright and Similar Rights means copyright and/or similar rights closely related to copyright including, without limitation, performance, broadcast, sound recording, and Sui Generis Database Rights, without regard to how the rights are labeled or categorized. For purposes of this Public License, the rights specified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.
 * Effective Technological Measures means those measures that, in the absence of proper authority, may not be circumvented under laws fulfilling obligations under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, and/or similar international agreements.
 * Exceptions and Limitations means fair use, fair dealing, and/or any other exception or limitation to Copyright and Similar Rights that applies to Your use of the Licensed Material.
 * Licensed Material means the artistic or literary work, database, or other material to which the Licensor applied this Public License.
 * Licensed Rights means the rights granted to You subject to the terms and conditions of this Public License, which are limited to all Copyright and Similar Rights that apply to Your use of the Licensed Material and that the Licensor has authority to license.
 * Licensor means the individual(s) or entity(ies) granting rights under this Public License.
 * Share means to provide material to the public by any means or process that requires permission under the Licensed Rights, such as reproduction, public display, public performance, distribution, dissemination, communication, or importation, and to make material available to the public including in ways that members of the public may access the material from a place and at a time individually chosen by them.
 * Sui Generis Database Rights means rights other than copyright resulting from Directive 96/9/EC of the European Parliament and of the Council of 11 March 1996 on the legal protection of databases, as amended and/or succeeded, as well as other essentially equivalent rights anywhere in the world.
 * You means the individual or entity exercising the Licensed Rights under this Public License. Your has a corresponding meaning.
 * Section 2 – Scope.
 * 
 * License grant.
 * Subject to the terms and conditions of this Public License, the Licensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclusive, irrevocable license to exercise the Licensed Rights in the Licensed Material to:
 * reproduce and Share the Licensed Material, in whole or in part; and
 * produce, reproduce, and Share Adapted Material.
 * Exceptions and Limitations. For the avoidance of doubt, where Exceptions and Limitations apply to Your use, this Public License does not apply, and You do not need to comply with its terms and conditions.
 * Term. The term of this Public License is specified in Section 6(a).
 * Media and formats; technical modifications allowed. The Licensor authorizes You to exercise the Licensed Rights in all media and formats whether now known or hereafter created, and to make technical modifications necessary to do so. The Licensor waives and/or agrees not to assert any right or authority to forbid You from making technical modifications necessary to exercise the Licensed Rights, including technical modifications necessary to circumvent Effective Technological Measures. For purposes of this Public License, simply making modifications authorized by this Section 2(a)(4) never produces Adapted Material.
 * Downstream recipients.
 * Offer from the Licensor – Licensed Material. Every recipient of the Licensed Material automatically receives an offer from the Licensor to exercise the Licensed Rights under the terms and conditions of this Public License.
 * No downstream restrictions. You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, the Licensed Material if doing so restricts exercise of the Licensed Rights by any recipient of the Licensed Material.
 * No endorsement. Nothing in this Public License constitutes or may be construed as permission to assert or imply that You are, or that Your use of the Licensed Material is, connected with, or sponsored, endorsed, or granted official status by, the Licensor or others designated to receive attribution as provided in Section 3(a)(1)(A)(i).
 * Other rights.
 * 
 * Moral rights, such as the right of integrity, are not licensed under this Public License, nor are publicity, privacy, and/or other similar personality rights; however, to the extent possible, the Licensor waives and/or agrees not to assert any such rights held by the Licensor to the limited extent necessary to allow You to exercise the Licensed Rights, but not otherwise.
 * Patent and trademark rights are not licensed under this Public License.
 * To the extent possible, the Licensor waives any right to collect royalties from You for the exercise of the Licensed Rights, whether directly or through a collecting society under any voluntary or waivable statutory or compulsory licensing scheme. In all other cases the Licensor expressly reserves any right to collect such royalties.
 * Section 3 – License Conditions.
 * 
 * Your exercise of the Licensed Rights is expressly made subject to the following conditions.
 * 
 * Attribution.
 * 
 * If You Share the Licensed Material (including in modified form), You must:
 * 
 * retain the following if it is supplied by the Licensor with the Licensed Material:
 * identification of the creator(s) of the Licensed Material and any others designated to receive attribution, in any reasonable manner requested by the Licensor (including by pseudonym if designated);
 * a copyright notice;
 * a notice that refers to this Public License;
 * a notice that refers to the disclaimer of warranties;
 * a URI or hyperlink to the Licensed Material to the extent reasonably practicable;
 * indicate if You modified the Licensed Material and retain an indication of any previous modifications; and
 * indicate the Licensed Material is licensed under this Public License, and include the text of, or the URI or hyperlink to, this Public License.
 * You may satisfy the conditions in Section 3(a)(1) in any reasonable manner based on the medium, means, and context in which You Share the Licensed Material. For example, it may be reasonable to satisfy the conditions by providing a URI or hyperlink to a resource that includes the required information.
 * If requested by the Licensor, You must remove any of the information required by Section 3(a)(1)(A) to the extent reasonably practicable.
 * If You Share Adapted Material You produce, the Adapter's License You apply must not prevent recipients of the Adapted Material from complying with this Public License.
 * Section 4 – Sui Generis Database Rights.
 * 
 * Where the Licensed Rights include Sui Generis Database Rights that apply to Your use of the Licensed Material:
 * 
 * for the avoidance of doubt, Section 2(a)(1) grants You the right to extract, reuse, reproduce, and Share all or a substantial portion of the contents of the database;
 * if You include all or a substantial portion of the database contents in a database in which You have Sui Generis Database Rights, then the database in which You have Sui Generis Database Rights (but not its individual contents) is Adapted Material; and
 * You must comply with the conditions in Section 3(a) if You Share all or a substantial portion of the contents of the database.
 * For the avoidance of doubt, this Section 4 supplements and does not replace Your obligations under this Public License where the Licensed Rights include other Copyright and Similar Rights.
 * Section 5 – Disclaimer of Warranties and Limitation of Liability.
 * 
 * Unless otherwise separately undertaken by the Licensor, to the extent possible, the Licensor offers the Licensed Material as-is and as-available, and makes no representations or warranties of any kind concerning the Licensed Material, whether express, implied, statutory, or other. This includes, without limitation, warranties of title, merchantability, fitness for a particular purpose, non-infringement, absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not known or discoverable. Where disclaimers of warranties are not allowed in full or in part, this disclaimer may not apply to You.
 * To the extent possible, in no event will the Licensor be liable to You on any legal theory (including, without limitation, negligence) or otherwise for any direct, special, indirect, incidental, consequential, punitive, exemplary, or other losses, costs, expenses, or damages arising out of this Public License or use of the Licensed Material, even if the Licensor has been advised of the possibility of such losses, costs, expenses, or damages. Where a limitation of liability is not allowed in full or in part, this limitation may not apply to You.
 * The disclaimer of warranties and limitation of liability provided above shall be interpreted in a manner that, to the extent possible, most closely approximates an absolute disclaimer and waiver of all liability.
 * Section 6 – Term and Termination.
 * 
 * This Public License applies for the term of the Copyright and Similar Rights licensed here. However, if You fail to comply with this Public License, then Your rights under this Public License terminate automatically.
 * Where Your right to use the Licensed Material has terminated under Section 6(a), it reinstates:
 * 
 * automatically as of the date the violation is cured, provided it is cured within 30 days of Your discovery of the violation; or
 * upon express reinstatement by the Licensor.
 * For the avoidance of doubt, this Section 6(b) does not affect any right the Licensor may have to seek remedies for Your violations of this Public License.
 * For the avoidance of doubt, the Licensor may also offer the Licensed Material under separate terms or conditions or stop distributing the Licensed Material at any time; however, doing so will not terminate this Public License.
 * Sections 1, 5, 6, 7, and 8 survive termination of this Public License.
 * Section 7 – Other Terms and Conditions.
 * 
 * The Licensor shall not be bound by any additional or different terms or conditions communicated by You unless expressly agreed.
 * Any arrangements, understandings, or agreements regarding the Licensed Material not stated herein are separate from and independent of the terms and conditions of this Public License.
 * Section 8 – Interpretation.
 * 
 * For the avoidance of doubt, this Public License does not, and shall not be interpreted to, reduce, limit, restrict, or impose conditions on any use of the Licensed Material that could lawfully be made without permission under this Public License.
 * To the extent possible, if any provision of this Public License is deemed unenforceable, it shall be automatically reformed to the minimum extent necessary to make it enforceable. If the provision cannot be reformed, it shall be severed from this Public License without affecting the enforceability of the remaining terms and conditions.
 * No term or condition of this Public License will be waived and no failure to comply consented to unless expressly agreed to by the Licensor.
 * Nothing in this Public License constitutes or may be interpreted as a limitation upon, or waiver of, any privileges and immunities that apply to the Licensor or You, including from the legal processes of any jurisdiction or authority.
 * Creative Commons is not a party to its public licenses. Notwithstanding, Creative Commons may elect to apply one of its public licenses to material it publishes and in those instances will be considered the “Licensor.” The text of the Creative Commons public licenses is dedicated to the public domain under the CC0 Public Domain Dedication. Except for the limited purpose of indicating that material is shared under a Creative Commons public license or as otherwise permitted by the Creative Commons policies published at creativecommons.org/policies, Creative Commons does not authorize the use of the trademark “Creative Commons” or any other trademark or logo of Creative Commons without its prior written consent including, without limitation, in connection with any unauthorized modifications to any of its public licenses or any other arrangements, understandings, or agreements concerning use of licensed material. For the avoidance of doubt, this paragraph does not form part of the public licenses.
 * 
 * Creative Commons may be contacted at creativecommons.org.
 */
package org.white_sdev.white_ffmpegclient.service;

import org.white_sdev.white_ffmpegclient.model.bean.EncoderConfigurations;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.white_sdev.white_ffmpegclient.exceptions.White_FFmpegClientException;
import org.white_sdev.white_ffmpegclient.model.bean.*;
import static org.white_sdev.white_validations.parameters.ParameterValidator.notNullValidation;

/**
 *
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @since Jul 15, 2020
 */
@Slf4j
public class EncoderService {
    
    LinkedHashSet<Episode> currentEpisodes=new LinkedHashSet<>();
    public final String BATCH_COMMANDS_FILE_NAME="encoding-commands.bat";
    public final String encodingSubFolder="Encoded";
    public String encodingSubFolderPath;
    
    
    public EncoderService() throws IOException{
	encodingSubFolderPath="\""+new File(".").getCanonicalPath()+File.separator+encodingSubFolder+"\\"+"\"";
    }
    
    public void encode(Set<File> files) {
	log.trace("::encode(files) - Start: ");
	notNullValidation(files,"Files provided cant be null, provide some files to encode.");
	if (files == null) throw new IllegalArgumentException("The parameter can't be null.");
	try {
	    
	    ArrayList<String> commands= getEncodingCommands(files,EncoderConfigurations.useSubfolder,EncoderConfigurations.outputExtension);
	    Files.write(Paths.get("./"+BATCH_COMMANDS_FILE_NAME), commands, StandardCharsets.UTF_8);
	    executeBatchFile();
	    
	    
	    log.trace("::encode(files) - Finish: ");
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    /*
     *  Both Controller actions call this
     */
    public ArrayList<String> getEncodingCommands(Set<File> files,Boolean useSubfolder, String outputExtension) {
	log.trace("::getEncodingCommand(files) - Start: ");
	    if (files == null) return null;
	
	try {
	    
	    LinkedHashSet<String> commands= new LinkedHashSet<>();
	    
	    
	    for(var file:files){
		Episode episode=ShowsManager.getEpisode(file.getName());
		if(episode==null){
		    if(JOptionPane.showConfirmDialog(null, "It wasn't possible to identify one of the files as an episode of any of the known shows, do you want to continue scanning the files?")==JOptionPane.NO_OPTION){
			break;
		    }else{
			continue;
		    }
		}
		
		episode.file=file;
		String command=getEncodingCommand(episode,useSubfolder,outputExtension,EncoderConfigurations.addExternalSubtitles, VideoResolution.getVideoResolutionFrom(EncoderConfigurations.videoResolution) );
		episode.encodingCommand=command;
		commands.add(command);
		currentEpisodes.add(episode);
	    }
	    
	    
	    log.trace("::getEncodingCommand(files) - Finish: ");
	    return getFileLinesFromCommands(commands);
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to generate command due to an unexpected internal error.", e);
	}
    }

    /**
     * Core method of the library.
     * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
     * @param resolution
     * @since 2020-07-21
     * @param episode
     * @param useSubfolder
     * @param outputExtension
     * @param addExternalSubtitles
     * @return 
     */
    public String getEncodingCommand(Episode episode,Boolean useSubfolder, String outputExtension,Boolean addExternalSubtitles,VideoResolution resolution) {
	log.trace("::getEncodingCommand(episode) - Start: ");
	if (episode == null) return null;
	try {
	    
	    /*
	     * Expected output:
	     * "ffmpeg -i \"[Erai-raws] One Piece - 837 [1080p][Multiple Subtitle].mkv\" -vcodec h264_nvenc -pix_fmt yuv420p -preset slow -b:v 12M"
	     *    + " -maxrate:v 15M -cq 24 -qmin 24 -qmax 24  -rc cbr -c:a aac -b:a 224k -map 0:v -map 0:a -map 0:s:m:language:spa -c:s mov_text -disposition:s:s:0 default -map 0:s:m:language:eng -c:s mov_text \"One Piece S19E55-0837-[NvEnc@24+slow][ffmpeg].mp4\""
	     */
	    	    
	    if (useSubfolder) encodingSubFolderPath="\""+episode.file.getParent()+File.separator+encodingSubFolder+"\\"+"\"";
	    
	    //Simulated Constants ought to be parameterized in later versions
	    String ENCODER=(EncoderConfigurations.ffmpegPath==null?"ffmpeg":"\""+EncoderConfigurations.ffmpegPath+"\"")+" -hwaccel nvdec";
	    Integer videoBitrateMB=resolution.idealBitrateKB/1000;
	    String ENCODER_VIDEO="-vcodec h264_nvenc -pix_fmt yuv420p -preset slow -b:v "+videoBitrateMB+"M -rc cbr -cbr true -cq 24 -qmin 24 -qmax 24";
//	    String encoderQuality="-b:v 12M -maxrate:v 12M -cq 24 -qmin 24 -qmax 24 -rc cbr";
	    String ENCODER_AUDIO="-c:a aac -b:a 224k";
	    
	    //Current support for Spanish and English only
	    String SUBTITLES_SPANISH="-map 0:s:m:language:spa -c:s mov_text -disposition:s:s:0 default -map 0:s:m:language:eng -c:s mov_text";
	    String SUBTITLES_ENGLISH="-map 0:s:m:language:eng -c:s mov_text -disposition:s:s:0 default -map 0:s:m:language:spa -c:s mov_text";
	    String SUBTITLES_NONE="-map 0:s -c:s mov_text";
	    String SUBTITLES=	(EncoderConfigurations.selectedLanguage==EncoderConfigurations.Language.NONE? SUBTITLES_NONE:
				 EncoderConfigurations.selectedLanguage==EncoderConfigurations.Language.ENGLISH? SUBTITLES_ENGLISH:
				 SUBTITLES_SPANISH);
	    
	    log.debug("::getEncodingCommand(episode) addExternalSubtitles:" + addExternalSubtitles);
	    Subtitle externalSubtitle=null;
	    if(addExternalSubtitles){
		externalSubtitle=getSubtitle(episode);
		if(externalSubtitle!=null ||  JOptionPane.showConfirmDialog(null, 
			"it was impossible to find the subtitles file for episode file:"+ episode.file.getName()+ ".\n "
				+ "Do want to skip it? (If NO the enire process will be canceled) ", "WARNING", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
		    SUBTITLES="-map 1:s:0 -c:s mov_text -metadata:s:s:0 language="+externalSubtitle.getSubtitleLanguageCode()+" -disposition:s:s:0 default "+SUBTITLES_NONE;
		}else{
		    return null;
		}
	    }
	    
	    String ENCODER_MAPPINGS="-map 0:v -map 0:a "+SUBTITLES;
	    String VERBOSE="-["+resolution.verticalPixels+"p][NvEnc@24+slow][ffmpeg]";
	    
	    String input="-i \""+episode.file.getAbsolutePath()+"\"";
	    String externalSubs=addExternalSubtitles?"-i \""+externalSubtitle.file.getAbsolutePath()+"\"":"";
	    String output="\""+episode.file.getParent()+File.separator+(useSubfolder?encodingSubFolder+"\\":"")+
		    episode.season.show.name+" S"+episode.season.number+"E"+episode.seasonEpisodeNumber
		    +((episode.absoluteEpisodeNumber!=null&&!episode.absoluteEpisodeNumber.isBlank())?("-"+episode.absoluteEpisodeNumber):"")+ //adds absolute number in case it has it
		    VERBOSE+"."+outputExtension+"\"";
	    
	    String cmd=ENCODER+" "+
		    input+" "+
		    (addExternalSubtitles?externalSubs+" ":"")+
		    ENCODER_VIDEO+" "+
//		    encoderQuality+" "+
		    ENCODER_AUDIO+" "+
		    ENCODER_MAPPINGS+" "+
		    output;
	    
	    log.trace("::getEncodingCommand(episode) - Finish: ");
	    return cmd;
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("The encoding command is unobtainable.", e);
	}
    }

    
    /**
     * create a {@link List} of {@link File} lines from the given commands.  NA;
     * The given commands are treated as simple file lines and the method simply generates the common generic structure for a .bat file. 
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-07-18
     * @param commands {@link Set} of commands (lines for the file) to prepare to write.
     * @return returned ArrayList as a prepared collection of lines to write to your file
     * @throws IllegalArgumentException - if the provided parameter is null.
     */
    public ArrayList<String> getFileLinesFromCommands(Set<String> commands) {
	log.trace("::getFileLinesFromCommands(commands) - Start: ");
	notNullValidation(commands,"The parameter can't be null.");
	try{
	    
	    ArrayList<String> lines=new ArrayList<>();
//	    lines.add("@echo off");
	    if(EncoderConfigurations.useSubfolder) lines.add("MKDIR "+encodingSubFolderPath);
	    for(String command:commands)
		lines.add(command);
	    String notification="start C:\\Windows\\Media\\tada.wav";
	    lines.add(notification);
	    lines.add("pause");

	    log.trace("::getFileLinesFromCommands(commands) - Finish: ");
	    return lines;
	    
	} catch (Exception e) {
	    log.debug("::getFileLinesFromCommands(commands) - Exception: "+e);
            throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
        }
    }

    private void executeBatchFile() {
	log.trace("::executeBatchFile() - Start: ");
	
	try {
	    
	    String localPath=new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getPath()+"\\";
	    String command="start \"Encoding\" /belownormal "+"\""+localPath+BATCH_COMMANDS_FILE_NAME+"\"";
	    log.info("::executeBatchFile() Command: "+command);
	    java.lang.Process process=Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", command});
	    
	    
	    log.trace("::executeBatchFile() - Finish: ");
	    
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    public Subtitle getSubtitle(Episode episode) {
	log.trace("::getSubtitleLanguage(episode) - Start: ");
	if (episode == null) return null;
	try {
	    
	    for (java.util.Map.Entry<EncoderConfigurations.Language, String> entry : Subtitle.SUPPORTED_LANGUAGES.entrySet()) {
		String languageCode = entry.getValue(); //String Representation in a filename
		String fileNameNoExtension=getNameWithoutExtension(episode.file.getPath());
		
		//Iterates on SUPPORTED_SUBSTITLE_EXTENSIONS {ASS SRT}
		for(Map.Entry<Subtitle.SubtitleFileExtension,String> subtitleExtension:Subtitle.SUPPORTED_SUBSTITLE_EXTENSIONS.entrySet()){
		    String subsFileNameToLookFor= fileNameNoExtension + "." + languageCode + "." + subtitleExtension.getValue();
		    File foundSubtitlesFile=null;
		    log.info("::getSubtitleLanguage(episode) - Looking for subtitle: "+subsFileNameToLookFor);
		    if(new File(subsFileNameToLookFor).exists())foundSubtitlesFile=new File(subsFileNameToLookFor);
		     return new Subtitle(foundSubtitlesFile,entry);//continue if not found 
		}
	    }
	    
	    log.trace("::getSubtitleLanguage(episode) - Finish: ");
	    return null;
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    private String getNameWithoutExtension(String fileName) {
	log.trace("::getNameWithoutExtension(name) - Start: "+fileName);
	if (fileName == null) return null;
	try {
	    
	    var nameSections= fileName.split("\\.");
	    if(nameSections==null || nameSections.length<2) throw new White_FFmpegClientException("Impossible to remove the extension of the file: \""+fileName+"\" - it can't be splited.");
	    if(nameSections.length>3) log.warn("::getSubtitleLanguage(episode) : The file has dots (.) in its name. Trying to extract extension file");
	    
	    String noExtensionFileName="";
	    for(int i=0;i<nameSections.length-1;i++){// lenght-1 = (ignore the last element)
		String nameSection=nameSections[i];
		noExtensionFileName+=nameSection;
	    }
	    
	    log.trace("::getNameWithoutExtension(name) - Finish: ");
	    return noExtensionFileName;
	    
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }


    

    

    

    
    
    
    

}
