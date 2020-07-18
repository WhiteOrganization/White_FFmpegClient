/*
 *  Filename:  ShowsManager.java
 *  Creation Date:  Jul 17, 2020
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

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.white_sdev.white_ffmpegclient.exceptions.White_FFmpegClientException;
import org.white_sdev.white_ffmpegclient.model.bean.Episode;
import org.white_sdev.white_ffmpegclient.model.bean.Season;
import org.white_sdev.white_ffmpegclient.model.bean.Show;


/**
 * 
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @since Jul 17, 2020
 */
@Slf4j
public class ShowsManager {
    
    
    final static String SHOWS_FILE_NAME="shows.json";
    final static String INFO_WEBSITE="https://github.com/white-sdev/White_FFmpegClient";

    final static String SEASON_REGEX="S\\d[\\d]+";
    final static String SEASON_EPISODE_REGEX="E[\\d]+";
    final static String ABSOLUTE_EPISODE_REGEX="[\\s\\-][\\d]+[\\s\\-]";
    
    public static LinkedHashSet<Show> getKnownShows() {
	log.trace("::getKnownShows() - Start: ");
	try {
	    
	    LinkedHashSet<Show> shows=readShowsJSONFile(SHOWS_FILE_NAME);
	    if( shows ==null || shows.size()<1){
		if(JOptionPane.showConfirmDialog(null, "Shows file "+SHOWS_FILE_NAME+" not found, using default list of initial shows, "
			+ "please provide this file within the app executable (JAR) path to ensure your shows are detected.\n "
			    +"Do you wish to have a sample file for you to edit it and add your shows?.\n"
				    + "More information: "+INFO_WEBSITE+"", "Create Sample File?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
		    writeSampleJSONStructure();
		}
		shows=new LinkedHashSet<Show>(){{
		    
		    javax.swing.JOptionPane.showMessageDialog(null, "Shows file "+SHOWS_FILE_NAME+
			    " not found, using default list of initial shows, please this file along with the app executable (JAR) to ensure your shows are detected.\n "
				    + "More information: "+INFO_WEBSITE+"",
			    "Error",
			    javax.swing.JOptionPane.WARNING_MESSAGE );
		    
		    add(getObsoleteOnePiece());
		}};
	    }
	    
	    log.trace("::getKnownShows() - Finish: ");
	    return shows;
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to obtain shows due to an unknown internal error.", e);
	}
    }
    
    public static LinkedHashSet<Show> readShowsJSONFile(String fileName) {
	log.trace("::readShowsJSONFile(parameter) - Start: ");
	
	try (FileReader reader = new FileReader(fileName)){

	    JSONArray showsJSONArray = (JSONArray) new JSONParser().parse(reader);
	    LinkedHashSet<Show> shows=new LinkedHashSet<>();
	    showsJSONArray.forEach( showJSON -> 
		    shows.add(Show.toShow( (JSONObject) showJSON ) ) 
	    );

	    log.trace("::readShowsJSONFile(parameter) - Finish: ");
	    return shows;

	} catch (FileNotFoundException e) {
	    throw new White_FFmpegClientException("File shows.json wasn't found. Imposible to read the shows from it.",e);
	} catch (IOException | ParseException e) {
	    throw new White_FFmpegClientException("An error occured when reading shows.json file. Imposible to read the shows from it.",e);
	}
	    
    }
    
    public static void writeSampleJSONStructure() {
	Show onePiece=getObsoleteOnePiece();
	Show showDePrueba=new Show("Prueba"){{
	   addSeason(new Season("01", this, 1f, 12f));
	   addSeason(new Season("02", this, 13f));
	}};
	
	try (FileWriter file = new FileWriter("shows.json")) {
	    
	    JSONArray showsJSONArray= new JSONArray(){{
		add(onePiece.toJSON());
		add(showDePrueba.toJSON());
	    }};
	    
            file.write(showsJSONArray.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            throw new White_FFmpegClientException("An error occured when writting the "+SHOWS_FILE_NAME+" file. Imposible to write the shows.",e);
        } catch (Exception e){
            throw new White_FFmpegClientException("Unexpected error occured when writting the "+SHOWS_FILE_NAME+" file.",e);
	}
    }
    
    public static Show getObsoleteOnePiece(){
	return new Show("One Piece"){{
	   addSeason(new Season("01", this, 1f, 61f));
	   addSeason(new Season("02", this, 62f, 77f));
	   addSeason(new Season("03", this, 78f, 92f));
	   addSeason(new Season("04", this, 93f, 130f));
	   addSeason(new Season("05", this, 131f, 143f));
	   addSeason(new Season("06", this, 144f, 195f));
	   addSeason(new Season("07", this, 196f, 228f));
	   addSeason(new Season("08", this, 229f, 263f));
	   addSeason(new Season("09", this, 264f, 336f));
	   addSeason(new Season("10", this, 337f, 381f));
	   addSeason(new Season("11", this, 382f, 407f));
	   addSeason(new Season("12", this, 408f, 421f));
	   addSeason(new Season("13", this, 422f, 458f));
	   addSeason(new Season("14", this, 459f, 516f));
	   addSeason(new Season("15", this, 517f, 578f));
	   addSeason(new Season("16", this, 579f, 628f));
	   addSeason(new Season("17", this, 629f, 746f));
	   addSeason(new Season("18", this, 747f, 782f));
	   addSeason(new Season("19", this, 783f, 877f));
	   addSeason(new Season("20", this, 878f, 889f));
	   addSeason(new Season("21", this, 890f));
	}};
    }
    
    public static Episode getEpisode(String fileName) {
	log.trace("::getEpisode(fileName) - Start: ");
	if (fileName == null) return null;
	try {
	    
	    
	    LinkedHashSet<Show> shows=ShowsManager.getKnownShows();
	    log.debug("::getEpisode(files) - Shows: {}",shows);
	    for(Show show:shows){
		if( fileName.contains(show.name)){
		    
		    
		    String seasonEpisodeNumberString=substringRegex(fileName,SEASON_EPISODE_REGEX);
		    //obtains the number with spaces then trims it then formats it for the specific show.
		    Integer digits=show.getNumberOfEpisodeNumberDigits();
		    String absoluteEpisodeNumberString=String.format("%0"+digits+"d", Integer.parseInt( substringRegex(fileName,ABSOLUTE_EPISODE_REGEX).trim()) );
		    String fileSeasonNumberString=substringRegex(fileName,SEASON_REGEX);
		    //convert to integer
		    Integer fileSeasonNumber=null;
		    try{    fileSeasonNumber=fileSeasonNumberString!=null?Integer.parseInt(fileSeasonNumberString):null;  }catch(NumberFormatException e){}
		    
		    
		    
		    if(seasonEpisodeNumberString==null && absoluteEpisodeNumberString==null) 
			throw new White_FFmpegClientException("Unattainable episode number. The algorithm couln't obtain the episode number from the file name.");
		    
		    //TODO ya se tiene el season number ¬¬... puede evitarse la iteracion?
		    for(Season season:show.getSeasons()){
			if (fileSeasonNumber!=null){
			    if(Integer.parseInt(season.number)==fileSeasonNumber )
				return new Episode(seasonEpisodeNumberString, absoluteEpisodeNumberString, season);
			}else{
			    if(absoluteEpisodeNumberString!=null && Float.parseFloat(absoluteEpisodeNumberString)>season.startsOnEpisode)
				if(season.endsOnEpisode==null || Float.parseFloat(absoluteEpisodeNumberString)<season.endsOnEpisode)
				    return new Episode(seasonEpisodeNumberString, absoluteEpisodeNumberString, season);
			}
		    }
		    
		}
	    }
	    
	    log.trace("::getEpisode(fileName) - Finish: ");
	    return null;
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to obtain the Episode from file name due to an error.", e);
	}
    }
    
    
    public static String substringRegex(String string, String regex) {
	log.trace("::matchRegex(fileName, regex) - Start: ");
	if (string == null || regex==null) return null;
	try {
	    
	    Matcher matcher = Pattern.compile(regex).matcher(string);
	    String match=matcher.find()?matcher.group(0):null;
	    
	    log.trace("::matchRegex(fileName, regex) - Finish: ");
	    return match;
	    
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    public static Float getRegexFloatFrom(String fileName, String regex) {
	log.trace("::getRegexFrom(fileName, regex) - Start: ");
	if (fileName == null || regex==null) return null;
	try {
	    String numberString=substringRegex(fileName,regex);
	    Float number=null;
	    try{    number=numberString!=null?Float.parseFloat(numberString):null;  }catch(NumberFormatException e){}
	    log.trace("::getRegexFrom(fileName, regex) - Finish: ");
	    return number;
	    
	} catch (Exception e) {
	    throw new White_FFmpegClientException("Impossible to get number from filename due to an error.", e);
	}
    }
    
    
}
